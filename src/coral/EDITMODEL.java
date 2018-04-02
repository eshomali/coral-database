/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coral;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        cuNameRad = new javax.swing.JRadioButton();
        cuNameTXT = new javax.swing.JTextField();
        dataProcessorTXT = new javax.swing.JTextField();
        inactiveTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cityTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        us_stateTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        techNotes2TXT = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        genNotesTXT = new javax.swing.JTextArea();
        contactNameTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contactInfoTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eReciptsTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        eReciptBranchesTXT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SMS_NumberTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("cuName");

        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        jLabel2.setText("dataProc");

        jLabel3.setText("Inactive?");

        jLabel4.setText("City");

        jLabel5.setText("State");

        techNotes2TXT.setColumns(20);
        techNotes2TXT.setRows(5);
        jScrollPane1.setViewportView(techNotes2TXT);

        genNotesTXT.setColumns(20);
        genNotesTXT.setRows(5);
        jScrollPane2.setViewportView(genNotesTXT);

        jLabel6.setText("ContName");

        jLabel7.setText("ContInfo");

        jLabel8.setText("eRec");

        jLabel9.setText("eRec Branch");

        jLabel10.setText("Gen Notes");

        jLabel11.setText("Tech Notes");

        jLabel12.setText("SMS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuNameTXT)
                                .addGap(18, 18, 18)
                                .addComponent(cuNameRad))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataProcessorTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(us_stateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contactInfoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inactiveTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contactNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eReciptBranchesTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eReciptsTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SMS_NumberTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuNameRad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cuNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataProcessorTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inactiveTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(contactNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(us_stateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(contactInfoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(eReciptsTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(eReciptBranchesTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(SMS_NumberTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        
        int rowCount = 0;
        int cuidVar = Coral.selectedCUID(comboBox);
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
    private javax.swing.JTextField SMS_NumberTXT;
    private javax.swing.JTextField cityTXT;
    private javax.swing.JTextField contactInfoTXT;
    private javax.swing.JTextField contactNameTXT;
    private javax.swing.JRadioButton cuNameRad;
    private javax.swing.JTextField cuNameTXT;
    private javax.swing.JTextField dataProcessorTXT;
    private javax.swing.JTextField eReciptBranchesTXT;
    private javax.swing.JTextField eReciptsTXT;
    private javax.swing.JTextArea genNotesTXT;
    private javax.swing.JTextField inactiveTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saveBTN;
    private javax.swing.JTextArea techNotes2TXT;
    private javax.swing.JTextField us_stateTXT;
    // End of variables declaration//GEN-END:variables

}