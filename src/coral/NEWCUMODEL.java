/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

//---Imports--------------------------------------------------------------------
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
//------------------------------------------------------------------------------
/**
 *
 * @author erin.rourke
 */
public class NEWCUMODEL extends javax.swing.JFrame {

    /**
     * Creates new form NEWCUMODEL
     */
    public NEWCUMODEL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        cuNameField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        stateBox = new javax.swing.JComboBox<>();
        dataComboBox = new javax.swing.JComboBox<>();
        errorLabel = new javax.swing.JLabel();
        cuRadio = new javax.swing.JRadioButton();
        fcuRadio = new javax.swing.JRadioButton();
        otherRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("Fill out the boxes below for the new credit union.");

        label1.setText("Credit Union Name");

        label2.setText("Data Processor");

        label3.setText("City");

        label4.setText("State/Country");

        cuNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuNameFieldActionPerformed(evt);
            }
        });

        goButton.setText("GO!");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        stateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" }));

        Statement st = Connect.go();
        ResultSet rs = null;
        try{
            rs = st.executeQuery("SELECT DISTINCT dataProcessor FROM credit_union");
        } catch (Exception e) { System.out.println(e); }
        String[] box = Coral.to1DStrArray(rs);
        DefaultComboBoxModel model = new DefaultComboBoxModel(box);
        dataComboBox.setEditable(true);
        dataComboBox.setModel(model);

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        buttonGroup.add(cuRadio);
        cuRadio.setText("CU");
        cuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuRadioActionPerformed(evt);
            }
        });

        buttonGroup.add(fcuRadio);
        fcuRadio.setText("FCU");
        fcuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcuRadioActionPerformed(evt);
            }
        });

        buttonGroup.add(otherRadio);
        otherRadio.setText("Non-banking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cuRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fcuRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherRadio))
                    .addComponent(cuNameField)
                    .addComponent(dataComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(label1)
                            .addComponent(label2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4)
                                    .addComponent(stateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuRadio)
                    .addComponent(fcuRadio)
                    .addComponent(otherRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(label4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton)
                    .addComponent(errorLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuNameFieldActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        //When this button is pressed, we need to get the information from 
        //the text fields and format a query to create a new record in the 
        //credit union table with this new information.
        
        //---Variables----------------------------------------------------------
        String inputName;
        boolean nameValid = true;
        String inputProcessor;
        String inputCity;
        boolean cityValid = true;
        String inputState;
        boolean stateValid = true;
        String ourQuery = "INSERT INTO credit_union (cuName, dataProcessor, "
                          + "city, us_state) VALUES (";
        String error = "ERROR: Invalid input. Please double check your data.";
        //----------------------------------------------------------------------
        
        //Get cuName
        inputName = (cuNameField.getText()).trim();
        //Error handling
        if(inputName.equals("")){
            nameValid = false;            
        }
        if((cuRadio.isSelected() || fcuRadio.isSelected() 
                    || otherRadio.isSelected()) == false){
            nameValid = false;
        }
        
        //Concatenates CU or FCU to the cuName depending on radio buttons
        if(cuRadio.isSelected()){
            inputName = inputName + " CU";
        }
        
        if(fcuRadio.isSelected()){
            inputName = inputName + " FCU";
        }        
        
        //Get data processor
        inputProcessor = (dataComboBox.getSelectedItem()).toString();
        //Error handling is not required because this is a comboBox
        
        //Get city
        inputCity = (cityField.getText()).trim();
        //Error handling
        if(inputCity.equals("")){
            cityValid = false;
        }
        
        //Get state
        inputState = (stateBox.getSelectedItem()).toString();
        //Error handling
        if(inputState.equals("")){
            stateValid = false;
        }
                
        //Construct the query        
        ourQuery = ourQuery + "'" + inputName + "', '" + inputProcessor + "', '" 
                    + inputCity + "', '" + inputState + "')";
        
        //Check the conditions before executing the query
        //if all user input is valid
        if(nameValid && cityValid && stateValid == true){
            //Execute the query
            try {
                Statement st = Connect.go();
                st.executeUpdate(ourQuery);
            } catch (Exception e) { System.out.println(); }
            
            //Close the window.
            this.dispose();
        }
        //if one or more of the fields are invalid
        else {
            
            errorLabel.setText(error);
        }
        
        
    }//GEN-LAST:event_goButtonActionPerformed

    private void cuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuRadioActionPerformed

    private void fcuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcuRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcuRadioActionPerformed
        
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(NEWCUMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEWCUMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEWCUMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEWCUMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEWCUMODEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField cuNameField;
    private javax.swing.JRadioButton cuRadio;
    private javax.swing.JComboBox<String> dataComboBox;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JRadioButton fcuRadio;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JRadioButton otherRadio;
    private javax.swing.JComboBox<String> stateBox;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}


