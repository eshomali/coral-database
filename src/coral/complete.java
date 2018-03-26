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
    }
    
     // checks if str1 starts with str2 - ignores case
    private boolean startsWithIgnoreCase(String str1, String str2) {
        return str1.toUpperCase().startsWith(str2.toUpperCase());
    }
   
     public Object lookupItem(String pattern){
        for(int i=0,n=model.getSize(); i<n; i++){       //iterating over all items 
        Object currentItem = model.getElementAt(i);
        if(startsWithIgnoreCase(currentItem.toString(), pattern)){     //current item starts with the pattern?
            System.out.println("'" + currentItem + "' matches pattern '" + pattern + "'");
            return currentItem;
        }
    }
        return null;        //no item starts with the pattern so returning null
    }
     
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        // reject the insert but print a message on the console
        System.out.println("insert " + str + " at " + offs);
        if(selecting) return;
        super.insertString(offs, str, a);    //insert the string into the document
        Object item = lookupItem(getText(0, getLength()));
        setSelectedItem(item);
        setText(item.toString());
        higlightCompletedText(offs+str.length());
        
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
        super.remove(0, getLength());
        super.insertString(0, text, null);
    }
    
    private void higlightCompletedText(int start){
        editor.setSelectionStart(start);
        editor.setSelectionEnd(getLength());
    }
    
    
    private static void createAndShowGUI() {
        // the combo box (add/modify items if you like to)
        JComboBox comboBox = new JComboBox(new Object[] {"John", "Khaleesi", "Arya", "Tyrion", "Joffrey", "Dead"});
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
}
