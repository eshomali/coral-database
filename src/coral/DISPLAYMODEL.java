/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JComboBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


/**
 *
 * @author erin.rourke
 */
public class DISPLAYMODEL extends javax.swing.JFrame {

    /**
     * Creates new form ComboBoxModel
     */
    public DISPLAYMODEL() {
        initComponents();
        
        //Set up the obsolete button (changeEventButton) with the listener
        changeEventButton.setVisible(false);
        ChangeListener cListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("CHANGE EVENT TRIGGERED");
                updateComboBox();
            }
        };
        changeEventButton.addChangeListener(cListener);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Nisarg Patel
    private void initComponents() {
        titleLabel = new JLabel();
        comboBox = new JComboBox<>();
        button = new JButton();
        jScrollPane0 = new JScrollPane();
        tableView0 = new JTable();
        cuLabel = new JLabel();
        laserLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        tableView1 = new JTable();
        thermalLabel = new JLabel();
        jScrollPane2 = new JScrollPane();
        tableView2 = new JTable();
        licenseLabel = new JLabel();
        jScrollPane3 = new JScrollPane();
        tableView3 = new JTable();
        newButton = new JButton();
        saveButton = new JButton();
        invalidInputText = new JLabel();
        editButton = new JButton();
        changeEventButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();

        //---- titleLabel ----
        titleLabel.setText("Select a credit union:");

        //---- comboBox ----
        Statement st = Connect.go();
                ResultSet rs = null;
                try{
                    rs = st.executeQuery("SELECT cuName FROM credit_union");
                } catch (Exception e) { System.out.println(e); }
                String[] box = Coral.to1DStrArray(rs);
                DefaultComboBoxModel model = new DefaultComboBoxModel(box);
                comboBox.setModel(model);
        comboBox.addActionListener(e -> comboBoxActionPerformed(e));
        JTextComponent editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
        editor.setDocument(new complete(comboBox));
        //comboBox.setSelectedIndex(0);

        //---- button ----
        button.setText("GO!");
        button.addActionListener(e -> buttonActionPerformed(e));

        //======== jScrollPane0 ========
        {
            jScrollPane0.setViewportView(tableView0);
        }

        //---- cuLabel ----
        cuLabel.setText("Credit Union Table");

        //---- laserLabel ----
        laserLabel.setText("Laser Table");

        //======== jScrollPane1 ========
        {
            jScrollPane1.setViewportView(tableView1);
        }

        //---- thermalLabel ----
        thermalLabel.setText("Thermal Table");

        //======== jScrollPane2 ========
        {
            jScrollPane2.setViewportView(tableView2);
        }

        //---- licenseLabel ----
        licenseLabel.setText("License Table");

        //======== jScrollPane3 ========
        {
            jScrollPane3.setViewportView(tableView3);
        }

        //---- newButton ----
        newButton.setText("NEW CREDIT UNION");
        newButton.addActionListener(e -> newButtonActionPerformed(e));

        //---- saveButton ----
        saveButton.setText("SAVE CHANGES");
        saveButton.addActionListener(e -> saveButtonActionPerformed(e));

        //---- invalidInputText ----
        invalidInputText.setForeground(Color.red);

        //---- editButton ----
        editButton.setText("EDIT CREDIT UNION");
        editButton.addActionListener(e -> editButtonActionPerformed(e));

        //---- changeEventButton ----
        changeEventButton.addActionListener(e -> changeEventButtonActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button)
                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addComponent(invalidInputText)
                        .addComponent(editButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(licenseLabel)
                        .addComponent(thermalLabel)
                        .addComponent(laserLabel)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(cuLabel)
                            .addGap(368, 368, 368)
                            .addComponent(changeEventButton))
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane0))
                    .addContainerGap(24, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(cuLabel)
                                .addComponent(titleLabel)))
                        .addComponent(changeEventButton))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(invalidInputText))
                        .addComponent(jScrollPane0, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(laserLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(thermalLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(licenseLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(newButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saveButton))
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        
        //---Variables----------------------------------------------------------
        String input;  //input from the comboBox (selected by the user)
        int cuidVar = 0;    //cuID of the credit union selected by the user
        boolean selAll = false; //unneeded as of yet
        //----------------------------------------------------------------------
        
        
        //Error handling: make sure that the box is not empty
        if((((comboBox.getSelectedItem()).toString()).trim()).equals("")){
            invalidInputText.setText("ERROR: Invalid input. You must select a credit union.");
        }
        else{
            //Determine what credit union has been selected by cuID
            cuidVar = Coral.selectedCUID(comboBox);
            //Error handling: make sure that the credit union exists.
            if(cuidVar == -1){
                invalidInputText.setText("ERROR: The credit union entered does not exist.");
            }
            else{
                //call creditU() to populate the first table
                creditUnion.creditU(cuidVar, tableView0);

                //call laserP() to populate the second table
                laserPrinter.laserP(cuidVar, tableView1);

                //Call thermalP() to populate the third table
                thermalPrinter.thermalP(cuidVar, tableView2);

                //call license() to populate the fourth table
                licenseList.license(cuidVar, tableView3);
            }

        }
    }//GEN-LAST:event_buttonActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        NEWCUMODEL frame = new NEWCUMODEL(this);
        frame.setVisible(true);
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        EDITMODEL frame = new EDITMODEL(comboBox); 
        frame.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void changeEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEventButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeEventButtonActionPerformed
    
    public JComboBox getComboBox(){
        return comboBox;
    }
    
    public void updateComboBox(){
        System.out.println("updateComboBox entered.");
        Statement st = Connect.go();
        ResultSet rs = null;
        try {
            rs = st.executeQuery("SELECT cuName FROM credit_union");
        } catch (Exception e) { System.out.println(e); }
        String[] box = Coral.to1DStrArray(rs);
        DefaultComboBoxModel newModel = new DefaultComboBoxModel(box);
        comboBox.setModel(newModel);
    }
    
    //Used to generate ChangeEvent to trigger comboBox update
    public void clickNotButton(){
        changeEventButton.doClick();
    }
    /*
    public static ActionListener myListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            NEWCUMODEL objNEWCU = new NEWCUMODEL();
            
        }
    };
    */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DISPLAYMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISPLAYMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISPLAYMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISPLAYMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISPLAYMODEL().setVisible(true);
            }
        });
    }
    /*
    public void updateBox(){
        Statement st = Connect.go();
        ResultSet rs = null;
        try{
            rs = st.executeQuery("SELECT cuName FROM credit_union");
            System.out.println(Coral.getRowNum(rs));
        } catch (Exception e) { System.out.println(e); }
        String[] box = Coral.to1DStrArray(rs);
        for(int i = 1140; i < 1165; i++){
            System.out.println("i: " + i + "     credit union: " + box[i]);
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(box);
        comboBox.setModel(model);
    }
    
    public void addElementx(String x){
        DefaultComboBoxModel newModel = (DefaultComboBoxModel) comboBox.getModel();
        newModel.addElement(x);
        comboBox.setModel(newModel);
    }
    
    public void updateComboBox(String x){
        ((DefaultComboBoxModel) comboBox.getModel()).addElement(x);
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nisarg Patel
    private JLabel titleLabel;
    private JComboBox<String> comboBox;
    private JButton button;
    private JScrollPane jScrollPane0;
    private JTable tableView0;
    private JLabel cuLabel;
    private JLabel laserLabel;
    private JScrollPane jScrollPane1;
    private JTable tableView1;
    private JLabel thermalLabel;
    private JScrollPane jScrollPane2;
    private JTable tableView2;
    private JLabel licenseLabel;
    private JScrollPane jScrollPane3;
    private JTable tableView3;
    private JButton newButton;
    private JButton saveButton;
    private JLabel invalidInputText;
    private JButton editButton;
    private JButton changeEventButton;
    // End of variables declaration//GEN-END:variables
}
