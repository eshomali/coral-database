/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

/**
 *
 * @author nisarg.patel
 */

import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.*;

public class complete extends PlainDocument{
    
    JComboBox comboBox;
    ComboBoxModel model;
    boolean selecting = false;
    JTextComponent editor;
    
    public complete(final JComboBox comboBox){
        this.comboBox = comboBox;
        model = comboBox.getModel();
        editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!selecting) highlightCompletedText(0);
            }
        });
        editor.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (comboBox.isDisplayable()) comboBox.setPopupVisible(true);
            }
        });
        
    }
    
     // checks if str1 starts with str2 - ignores case
    private boolean startsWithIgnoreCase(String str1, String str2) {
        return str1.toUpperCase().startsWith(str2.toUpperCase());
    }
   
     public Object lookupItem(String pattern){
        
        Object selectedItem = model.getSelectedItem();
        // only search for a different item if the currently selected does not match
        if (selectedItem != null && startsWithIgnoreCase(selectedItem.toString(), pattern)) {
            return selectedItem;
        } else {
            // iterate over all items
            for (int i=0, n=model.getSize(); i < n; i++) {
                Object currentItem = model.getElementAt(i);
                // current item starts with the pattern?
                if (startsWithIgnoreCase(currentItem.toString(), pattern)) {
                    return currentItem;
                }
            }
        }
        // no item starts with the pattern => return null
        System.out.println("No item matches pattern '" + pattern + "'");
        return pattern; 
         
        /*
        for(int i=0,n=model.getSize(); i<n; i++){       //iterating over all items 
        Object currentItem = model.getElementAt(i);
        if(startsWithIgnoreCase(currentItem.toString(), pattern)){     //current item starts with the pattern?
            System.out.println("'" + currentItem + "' matches pattern '" + pattern + "'");
            return currentItem;
        }
    }
        return null;        //no item starts with the pattern so returning null
         
         */
    }
     
     
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
         // return immediately when selecting an item
        if (selecting) return;
        // insert the string into the document
        super.insertString(offs, str, a);
        // lookup and select a matching item
        Object item = lookupItem(getText(0, getLength()));
        if (item != null) {
            setSelectedItem(item);
        } else {
            // keep old item selected if there is no match
            item = comboBox.getSelectedItem();
            // imitate no insert (later on offs will be incremented by str.length(): selection won't move forward)
            offs = offs-str.length();
            // provide feedback to the user that his input has been received but can not be accepted
            comboBox.getToolkit().beep(); // when available use: UIManager.getLookAndFeel().provideErrorFeedback(comboBox);
        }
        setText(item.toString());
        // select the completed part
        highlightCompletedText(offs+str.length());
        
        /* reject the insert but print a message on the console
        System.out.println("insert " + str + " at " + offs);
        if(selecting) return;
        super.insertString(offs, str, a);    //insert the string into the document
        Object item = lookupItem(getText(0, getLength()));
        setSelectedItem(item);
        setText(item.toString());
        highlightCompletedText(offs+str.length());
        
        /*String content = getText(0, getLength());   //get the resulting string 
        Object item = lookupItem(content);  //lookup a matching item
        if(item != model.getSelectedItem()){        //select the item (or deselect if null)
            System.out.println("Selecting '" +item+ "'");
            
        };
        model.setSelectedItem(item);
        */
    }
    
    public void remove(int offs, int len) throws BadLocationException{
        if (selecting)  return;     //return immediately when selcting an item 
        super.remove(offs, len);    
    }
    
    private void setSelectedItem(Object item){
        selecting = true;
        model.setSelectedItem(item);
        selecting = false;
    }
    
    private void setText(String text) throws BadLocationException{
        
        try{
            super.remove(0, getLength());
            super.insertString(0, text, null);
        }
        catch(BadLocationException e){
            throw new RuntimeException(e.toString());
        }
        
        /*super.remove(0, getLength());
        super.insertString(0, text, null);*/
    }
    
    private void highlightCompletedText(int start){
        editor.setSelectionStart(start);
        editor.setSelectionEnd(getLength());
    }
    
}

//The following code was used to test this class.
/*
    private static void createAndShowGUI() {
        // the combo box (add/modify items if you like to)
        JComboBox comboBox = new JComboBox(new Object[] {"John", "Khaleesi", "Kite", "aron", "Arya","tom", "Tyrion", "Joffrey", "Dead"});
        // has to be editable
        comboBox.setEditable(true);
        // get the combo boxes editor component
        JTextComponent editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
        // change the editor's document
        editor.setDocument(new complete(comboBox));
        // create and show a window containing the combo box
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.getContentPane().add(comboBox);
        frame.pack(); frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
*/
