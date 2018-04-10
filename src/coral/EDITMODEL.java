/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coral;

import java.awt.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;


/**
 *
 * @author essa.shomali
 */
public class EDITMODEL extends javax.swing.JFrame {

    /** Creates new form EDIT */
    public EDITMODEL(JComboBox comboBox) {
        initComponents();
        String[] cu = new String[55];
        int rowCount = 0;
        int cuidVar = Coral.selectedCUID(comboBox);
        int i = 0;
            String cuID;
            String cuName = null;
            String dataProcessor = null;
            String inactive = null;
            String city = null;
            String us_state = null;
            String contactName = null;
            String contactInfo = null;
            String eRecipts = null;
            String eReciptBranches = null;
            String emailEncryption;
            String emailEncryptionType;
            String emailEncryptionSeats;
            String brandedPortal;
            String sigSales;
            String DCN;
            String iDS;
            String serverIP;
            String serverName;
            String serverOS;
            String sqlInstance;
            String sqlVersion;
            String branchNumber;
            String cdVersion;
            String manageDBName;
            String tellerDBName;
            String eSign;
            String eSignType;
            String eSignSeats;
            String DMSLogin;
            String DMSPassword;
            String installPath;
            String managePurchaseDate;
            String tellerPurchaseDate;
            String scanID;
            String scanIDCount;
            String scanStation;
            String scanStationCount;
            String scanPort;
            String transPort;
            String txtReceipts;
            String txtReceiptBranch;
            String SMS_Number = null;
            String laserSupportType;
            String thermalColor;
            String thermalMasking;
            String thermalFontSize;
            String thermalDuplicate;
            String thermalT_ck;
            String thermalEndorse_ck;
            String thermalDateLastPurchase;
            String thermalNotes;
            String techNotes1;
            String techNotes2 = null;
            String genNotes = null; 
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
                
            String querySel = String.format("SELECT * from credit_union");    //credit_union
            String queryID = String.format(" where cuID = " + cuidVar);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(querySel + queryID); //selects specified stuff
            //ResultSet rs = st.executeQuery(querySel); //selects all
            
        while(rs.next()){ 
    
            int rowNum = rs.getRow();

            cuID = Integer.toString(rs.getInt("cuID"));
            cuName = rs.getString("cuName");
            dataProcessor = rs.getString("dataProcessor");
            inactive = rs.getString("inactive");
            city = rs.getString("city");
            us_state = rs.getString("us_state");
            contactName = rs.getString("contactName");
            contactInfo = rs.getString("contactInfo");
            eRecipts = rs.getString("eRecipts");
            eReciptBranches = rs.getString("eReciptBranches");
            emailEncryption = rs.getString("emailEncryption");
            emailEncryptionType = rs.getString("emailEncryptionType");
            emailEncryptionSeats = rs.getString("emailEncryptionSeats");
            brandedPortal = rs.getString("brandedPortal");
            sigSales = rs.getString("sigSales");
            DCN = rs.getString("DCN");
            iDS = rs.getString("iDS");
            serverIP = rs.getString("serverIP");
            serverName = rs.getString("serverName");
            serverOS = rs.getString("serverOS");
            sqlInstance = rs.getString("sqlInstance");
            sqlVersion = rs.getString("sqlVersion");
            branchNumber = rs.getString("branchNumber");
            cdVersion = rs.getString("cdVersion");
            manageDBName = rs.getString("manageDBName");
            tellerDBName = rs.getString("tellerDBName");
            eSign = rs.getString("eSign");
            eSignType = rs.getString("eSignType");
            eSignSeats = rs.getString("eSignSeats");  
            DMSLogin = rs.getString("DMSLogin");
            DMSPassword = rs.getString("DMSPassword");
            installPath = rs.getString("installPath");
            managePurchaseDate = rs.getString("managePurchaseDate");
            tellerPurchaseDate = rs.getString("tellerPurchaseDate");
            scanID = rs.getString("scanID");
            scanIDCount = rs.getString("scanIDCount");
            scanStation = rs.getString("scanStation");
            scanStationCount = rs.getString("scanStationCount");
            scanPort = rs.getString("scanPort");
            transPort = rs.getString("transPort");
            txtReceipts = rs.getString("txtReceipts");
            txtReceiptBranch = rs.getString("txtReceiptBranch");
            SMS_Number = rs.getString("SMS_Number");
            laserSupportType = rs.getString("laserSupportType");
            thermalColor = rs.getString("thermalColor");
            thermalMasking = rs.getString("thermalMasking");
            thermalFontSize = rs.getString("thermalFontSize");
            thermalDuplicate = rs.getString("thermalDuplicate");
            thermalT_ck = rs.getString("thermalT_ck");
            thermalEndorse_ck = rs.getString("thermalEndorse_ck");
            thermalDateLastPurchase = rs.getString("thermalDateLastPurchase");
            thermalNotes = rs.getString("thermalNotes");
            techNotes1 = rs.getString("techNotes1");
            techNotes2 = rs.getString("techNotes2");
            genNotes = rs.getString("genNotes"); 
            
          } 
            cuNameTXT.setText(cuName);
            dataProcessorTXT.setText(dataProcessor);
            inactiveTXT.setText(inactive);
            cityTXT.setText(city);
            us_stateTXT.setText(us_state);
            techNotes2TXT.setText(techNotes2);
            genNotesTXT.setText(genNotes);
            contactNameTXT.setText(contactName);
            contactInfoTXT.setText(contactInfo);
            eReciptsTXT.setText(eRecipts);
            eReciptBranchesTXT.setText(eReciptBranches);
            
            
            SMS_NumberTXT.setText(SMS_Number);
            
            con.close();
        } catch(Exception e) { System.out.println(e); }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Nisarg Patel
    private void initComponents() {
        jLabel1 = new JLabel();
        saveBTN = new JButton();
        cuNameRad = new JRadioButton();
        cuNameTXT = new JTextField();
        dataProcessorTXT = new JTextField();
        inactiveTXT = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        cityTXT = new JTextField();
        jLabel4 = new JLabel();
        us_stateTXT = new JTextField();
        jLabel5 = new JLabel();
        jScrollPane1 = new JScrollPane();
        techNotes2TXT = new JTextArea();
        jScrollPane2 = new JScrollPane();
        genNotesTXT = new JTextArea();
        contactNameTXT = new JTextField();
        jLabel6 = new JLabel();
        contactInfoTXT = new JTextField();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        eReciptsTXT = new JTextField();
        jLabel9 = new JLabel();
        eReciptBranchesTXT = new JTextField();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        SMS_NumberTXT = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setText("cuName");

        //---- saveBTN ----
        saveBTN.setText("Save");
        saveBTN.addActionListener(e -> saveBTNActionPerformed(e));

        //---- jLabel2 ----
        jLabel2.setText("dataProc");

        //---- jLabel3 ----
        jLabel3.setText("Inactive?");

        //---- jLabel4 ----
        jLabel4.setText("City");

        //---- jLabel5 ----
        jLabel5.setText("State");

        //======== jScrollPane1 ========
        {

            //---- techNotes2TXT ----
            techNotes2TXT.setColumns(20);
            techNotes2TXT.setRows(5);
            jScrollPane1.setViewportView(techNotes2TXT);
        }

        //======== jScrollPane2 ========
        {

            //---- genNotesTXT ----
            genNotesTXT.setColumns(20);
            genNotesTXT.setRows(5);
            jScrollPane2.setViewportView(genNotesTXT);
        }

        //---- jLabel6 ----
        jLabel6.setText("ContName");

        //---- jLabel7 ----
        jLabel7.setText("ContInfo");

        //---- jLabel8 ----
        jLabel8.setText("eRec");

        //---- jLabel9 ----
        jLabel9.setText("eRec Branch");

        //---- jLabel10 ----
        jLabel10.setText("Gen Notes");

        //---- jLabel11 ----
        jLabel11.setText("Tech Notes");

        //---- jLabel12 ----
        jLabel12.setText("SMS");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4, GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(cuNameTXT)
                                    .addGap(18, 18, 18)
                                    .addComponent(cuNameRad))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(cityTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataProcessorTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(us_stateTXT, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(contactInfoTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(inactiveTXT, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(contactNameTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eReciptBranchesTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(eReciptsTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(saveBTN))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SMS_NumberTXT, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(cuNameRad)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cuNameTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dataProcessorTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(inactiveTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(contactNameTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(cityTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(us_stateTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(contactInfoTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(eReciptsTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(eReciptBranchesTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(SMS_NumberTXT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel11)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(saveBTN, GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        
        int rowCount = 0;
        DISPLAYMODEL model = new DISPLAYMODEL();
        int cuidVar = Coral.selectedCUID(model.getComboBox());
        int i = 0;
            String cuID;
            String cuName = null;
            String dataProcessor = null;
            String inactive = null;
            String city = null;
            String us_state = null;
            String contactName;
            String contactInfo;
            String eRecipts;
            String eReciptBranches;
            String emailEncryption = null;
            String emailEncryptionType;
            String emailEncryptionSeats;
            String brandedPortal;
            String sigSales;
            String DCN;
            String iDS;
            String serverIP;
            String serverName;
            String serverOS;
            String sqlInstance;
            String sqlVersion;
            String branchNumber;
            String cdVersion;
            String manageDBName;
            String tellerDBName;
            String eSign;
            String eSignType;
            String eSignSeats;
            String DMSLogin;
            String DMSPassword;
            String installPath;
            String managePurchaseDate;
            String tellerPurchaseDate;
            String scanID;
            String scanIDCount;
            String scanStation;
            String scanStationCount;
            String scanPort;
            String transPort;
            String txtReceipts;
            String txtReceiptBranch;
            String SMS_Number;
            String laserSupportType;
            String thermalColor;
            String thermalMasking;
            String thermalFontSize;
            String thermalDuplicate;
            String thermalT_ck;
            String thermalEndorse_ck;
            String thermalDateLastPurchase;
            String thermalNotes;
            String techNotes1;
            String techNotes2;
            String genNotes;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
                
            String queryUpdate = String.format( "UPDATE credit_union SET " +
                                                "cuName = '" +          cuNameTXT.getText() +               "'," +
                                                "dataProcessor = '" +   dataProcessorTXT.getText() +        "'," +
                                                "inactive = '" +        inactiveTXT.getText() +             "'," +
                                                "city = '" +            cityTXT.getText() +                 "'," +
                                                "us_state = '" +        us_stateTXT.getText() +             "'," +
                                                "techNotes2 = '" +      techNotes2TXT.getText() +           "'," +
                                                "genNotes = '" +        genNotesTXT.getText() +             "'," + 
                                                "contactName" +         contactNameTXT.getText() +          "'," +
                                                "contactInfo" +         contactInfoTXT.getText() +          "'," +
                                                "eRecipts" +            eReciptsTXT.getText() +             "'," +
                                                "eReciptBranches" +     eReciptBranchesTXT.getText() +      "'," +
                /*                                "emailEncryption" +     emailEncryptionTXT.getText() +      "'," +
                                                "emailEncryptionType" + emailEncryptionTypeTXT.getText() +  "'," +
                                                "emailEncryptionSeats"+ emailEncryptionSeatsTXT.getText() + "'," +
                                                "brandedPortal" +       brandedPortalTXT.getText() +        "'," +
                                                "sigSales" +            sigSalesTXT.getText() +             "'," +
                                                "DCN" +                 DCNTXT.getText() +                  "'," +
                                                "iDS" +                 iDSTXT.getText() +                  "'," +
                                                "serverIP" +            serverIPTXT.getText() +             "'," +
                                                "serverName" +          serverNameTXT.getText() +           "'," +
                                                "serverOS" +            serverOSTXT.getText() +             "'," +
                                                "sqlInstance" +         sqlInstanceTXT.getText() +          "'," +
                                                "sqlVersion" +          sqlVersionTXT.getText() +           "'," +
                                                "branchNumber" +        branchNumberTXT.getText() +         "'," +
                                                "cdVersion" +           cdVersionTXT.getText() +            "'," +
                                                "manageDBName" +        manageDBNameTXT.getText() +         "'," +
                                                "tellerDBName" +        tellerDBNameTXT.getText() +         "'," +
                                                "eSign" +               eSignTXT.getText() +                "'," +
                                                "eSignType" +           eSignTypeTXT.getText() +            "'," +
                                                "eSignSeats" +          eSignSeatsTXT.getText() +           "'," +
                                                "DMSLogin" +            DMSLoginTXT.getText() +             "'," +
                                                "DMSPassword" +         DMSPasswordTXT.getText() +          "'," +
                                                "installPath" +         installPathTXT.getText() +          "'," +
                                                "managePurchaseDate" +  managePurchaseDateTXT.getText() +   "'," +
                                                "tellerPurchaseDate" +  tellerPurchaseDateTXT.getText() +   "'," +
                                                "scanID" +              scanIDTXT.getText() +               "'," +
                                                "scanIDCount" +         scanIDCountTXT.getText() +          "'," +
                                                "scanStation" +         scanStationTXT.getText() +          "'," +
                                                "scanStationCount" +    scanStationCountTXT.getText() +     "'," +
                                                "scanPort" +            scanPortTXT.getText() +             "'," +
                                                "transPort" +           transPortTXT.getText() +            "'," +
                                                "txtReceipts" +         txtReceiptsTXT.getText() +          "'," +
                                                "txtReceiptBranch" +    txtReceiptBranchTXT.getText() +     "'," + */
                                                "SMS_Number" +          SMS_NumberTXT.getText() +           "'"  +
                                                "WHERE cuID = " + cuidVar );
            
            Statement st = con.createStatement();
            int rs = st.executeUpdate(queryUpdate); //selects specified stuff
            con.close();
        } catch(Exception e) { System.out.println(e); }
        
        
        
        
    }//GEN-LAST:event_saveBTNActionPerformed

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
            java.util.logging.Logger.getLogger(EDITMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDITMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDITMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDITMODEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EDITMODEL().setVisible(true);
                //new EDIT().populate();
            //JTextField cuNameTxt = new JTextField();
            
                
            }
        });
    }
    
        public void populate(){  

     
                
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nisarg Patel
    private JLabel jLabel1;
    private JButton saveBTN;
    private JRadioButton cuNameRad;
    private JTextField cuNameTXT;
    private JTextField dataProcessorTXT;
    private JTextField inactiveTXT;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField cityTXT;
    private JLabel jLabel4;
    private JTextField us_stateTXT;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JTextArea techNotes2TXT;
    private JScrollPane jScrollPane2;
    private JTextArea genNotesTXT;
    private JTextField contactNameTXT;
    private JLabel jLabel6;
    private JTextField contactInfoTXT;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JTextField eReciptsTXT;
    private JLabel jLabel9;
    private JTextField eReciptBranchesTXT;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JTextField SMS_NumberTXT;
    // End of variables declaration//GEN-END:variables

}