/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

//---Imports--------------------------------------------------------------------
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
//------------------------------------------------------------------------------
/**
 *
 * @author erin.rourke
 */
public class NEWCUMODEL extends javax.swing.JFrame {
    
    //---Variables--------------------------------------------------------------
    DISPLAYMODEL prevFrame;
    //--------------------------------------------------------------------------
    /**
     * Creates new form NEWCUMODEL
     */
    public NEWCUMODEL(DISPLAYMODEL dm){
        initComponents();
        prevFrame = dm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        title = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        cuNameField = new JTextField();
        cityField = new JTextField();
        goButton = new JButton();
        stateBox = new JComboBox<>();
        dataComboBox = new JComboBox<>();
        errorLabel = new JLabel();
        cuRadio = new JRadioButton();
        fcuRadio = new JRadioButton();
        otherRadio = new JRadioButton();

        //======== this ========
        setDefaultCloseOperation(2);
        Container contentPane = getContentPane();

        //---- title ----
        title.setText("Fill out the boxes below for the new credit union.");

        //---- label1 ----
        label1.setText("Credit Union Name");

        //---- label2 ----
        label2.setText("Data Processor");

        //---- label3 ----
        label3.setText("City");

        //---- label4 ----
        label4.setText("State/Country");

        //---- cuNameField ----
        cuNameField.addActionListener(e -> cuNameFieldActionPerformed(e));

        //---- goButton ----
        goButton.setText("GO!");
        goButton.addActionListener(e -> goButtonActionPerformed(e));

        //---- stateBox ----
        stateBox.setModel(new DefaultComboBoxModel<>(new String[] {
            "AL",
            "AK",
            "AZ",
            "AR",
            "CA",
            "CO",
            "CT",
            "DE",
            "FL",
            "GA",
            "HI",
            "IA",
            "ID",
            "IL",
            "IN",
            "KS",
            "KY",
            "LA",
            "ME",
            "MD",
            "MA",
            "MI",
            "MN",
            "MS",
            "MO",
            "MT",
            "NC",
            "ND",
            "NE",
            "NH",
            "NJ",
            "NM",
            "NV",
            "NY",
            "OH",
            "OK",
            "OR",
            "PA",
            "RI",
            "SC",
            "SD",
            "TN",
            "TX",
            "UT",
            "VT",
            "VA",
            "WA",
            "WV",
            "WI",
            "WY"
        }));

        //---- dataComboBox ----
        Statement st = Connect.go();
        ResultSet rs = null;
        try{
            rs = st.executeQuery("SELECT DISTINCT dataProcessor FROM credit_union");
        } catch (Exception e) { System.out.println(e); }
        String[] box = Coral.to1DStrArray(rs);
        DefaultComboBoxModel model = new DefaultComboBoxModel(box);
        dataComboBox.setEditable(true);

        //---- errorLabel ----
        errorLabel.setHorizontalAlignment(4);

        //---- cuRadio ----
        cuRadio.setText("CU");
        cuRadio.addActionListener(e -> cuRadioActionPerformed(e));

        //---- fcuRadio ----
        fcuRadio.setText("FCU");
        fcuRadio.addActionListener(e -> fcuRadioActionPerformed(e));

        //---- otherRadio ----
        otherRadio.setText("Non-banking");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(cuRadio)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fcuRadio)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(otherRadio))
                        .addComponent(cuNameField)
                        .addComponent(dataComboBox, GroupLayout.Alignment.LEADING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(errorLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(goButton))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(title)
                                .addComponent(label1)
                                .addComponent(label2)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(cityField, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(stateBox, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 98, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title)
                    .addGap(18, 18, 18)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cuNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cuRadio)
                        .addComponent(fcuRadio)
                        .addComponent(otherRadio))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cityField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(stateBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(goButton)
                        .addComponent(errorLabel))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup ----
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(cuRadio);
        buttonGroup.add(fcuRadio);
        buttonGroup.add(otherRadio);
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

        //Trigger ChangeEvent
        prevFrame.clickNotButton();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel title;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField cuNameField;
    private JTextField cityField;
    private JButton goButton;
    private JComboBox<String> stateBox;
    private JComboBox<String> dataComboBox;
    private JLabel errorLabel;
    private JRadioButton cuRadio;
    private JRadioButton fcuRadio;
    private JRadioButton otherRadio;
    // End of variables declaration//GEN-END:variables
}


