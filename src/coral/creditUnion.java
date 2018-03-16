//------------------------------------------------------------------------------
//  creditUnion.java
//  |   This class represents the credit_union table in the MySQL database.
//------------------------------------------------------------------------------

package coral;

import java.sql.*;

import static coral.Model.main;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author essa.shomali
 */
public class creditUnion {
    
    public static void creditU(String creditUnionVar, int cuidVar, boolean selAll, JTable table){
        
        String[] cu = new String[55];
    //    String[] cuidJ = new String[55];
        int rowCount = 0;
        int i = 0;
        
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

            String cuID = Integer.toString(rs.getInt("cuID"));
            String cuName = rs.getString("cuName");
            String dataProcessor = rs.getString("dataProcessor");
            String inactive = rs.getString("inactive");
            String city = rs.getString("city");
            String us_state = rs.getString("us_state");
            String contactName = rs.getString("contactName");
            String contactInfo = rs.getString("contactInfo");
            String eRecipts = rs.getString("eRecipts");
            String eReciptBranches = rs.getString("eReciptBranches");
            String emailEncryption = rs.getString("emailEncryption");
            String emailEncryptionType = rs.getString("emailEncryptionType");
            String emailEncryptionSeats = rs.getString("emailEncryptionSeats");
            String brandedPortal = rs.getString("brandedPortal");
            String sigSales = rs.getString("sigSales");
            String DCN = rs.getString("DCN");
            String iDS = rs.getString("iDS");
            String serverIP = rs.getString("serverIP");
            String serverName = rs.getString("serverName");
            String serverOS = rs.getString("serverOS");
            String sqlInstance = rs.getString("sqlInstance");
            String sqlVersion = rs.getString("sqlVersion");
            String branchNumber = rs.getString("branchNumber");
            String cdVersion = rs.getString("cdVersion");
            String manageDBName = rs.getString("manageDBName");
            String tellerDBName = rs.getString("tellerDBName");
            String eSign = rs.getString("eSign");
            String eSignType = rs.getString("eSignType");
            String eSignSeats = rs.getString("eSignSeats");
            String DMSLogin = rs.getString("DMSLogin");
            String DMSPassword = rs.getString("DMSPassword");
            String installPath = rs.getString("installPath");
            String managePurchaseDate = rs.getString("managePurchaseDate");
            String tellerPurchaseDate = rs.getString("tellerPurchaseDate");
            String scanID = rs.getString("scanID");
            String scanIDCount = rs.getString("scanIDCount");
            String scanStation = rs.getString("scanStation");
            String scanStationCount = rs.getString("scanStationCount");
            String scanPort = rs.getString("scanPort");
            String transPort = rs.getString("transPort");
            String txtReceipts = rs.getString("txtReceipts");
            String txtReceiptBranch = rs.getString("txtReceiptBranch");
            String SMS_Number = rs.getString("SMS_Number");
            String laserSupportType = rs.getString("laserSupportType");
            String thermalColor = rs.getString("thermalColor");
            String thermalMasking = rs.getString("thermalMasking");
            String thermalFontSize = rs.getString("thermalFontSize");
            String thermalDuplicate = rs.getString("thermalDuplicate");
            String thermalT_ck = rs.getString("thermalT_ck");
            String thermalEndorse_ck = rs.getString("thermalEndorse_ck");
            String thermalDateLastPurchase = rs.getString("thermalDateLastPurchase");
            String thermalNotes = rs.getString("thermalNotes");
            String techNotes1 = rs.getString("techNotes1");
            String techNotes2 = rs.getString("techNotes2");
            String genNotes = rs.getString("genNotes"); 
            
            cu[0] = cuID;
            cu[1] = cuName;
            cu[2] = dataProcessor;
            cu[3] = inactive;
            cu[4] = city;
            cu[5] = us_state;
            cu[6] = contactName;
            cu[7] = contactInfo;
            cu[8] = eRecipts;
            cu[9] = eReciptBranches;
            cu[10] = emailEncryption;
            cu[11] = emailEncryptionType;
            cu[12] = emailEncryptionSeats;
            cu[13] = brandedPortal;
            cu[14] = sigSales;
            cu[15] = DCN;
            cu[16] = iDS;
            cu[17] = serverIP;
            cu[18] = serverName;
            cu[19] = serverOS;
            cu[20] = sqlInstance;
            cu[21] = sqlVersion;
            cu[22] = branchNumber;
            cu[23] = cdVersion;
            cu[24] = manageDBName;
            cu[25] = tellerDBName;
            cu[26] = eSign;
            cu[27] = eSignType;
            cu[28] = eSignSeats;
            cu[29] = DMSLogin;
            cu[30] = DMSPassword;
            cu[31] = installPath;
            cu[32] = managePurchaseDate;
            cu[33] = tellerPurchaseDate;
            cu[34] = scanID;
            cu[35] = scanIDCount;
            cu[36] = scanStation;
            cu[37] = scanStationCount;
            cu[38] = scanPort;
            cu[39] = transPort;
            cu[40] = txtReceipts;
            cu[41] = txtReceiptBranch;
            cu[42] = SMS_Number;
            cu[43] = laserSupportType;
            cu[44] = thermalColor;
            cu[45] = thermalMasking;
            cu[46] = thermalFontSize;
            cu[47] = thermalDuplicate;
            cu[48] = thermalT_ck;
            cu[49] = thermalEndorse_ck;
            cu[50] = thermalDateLastPurchase;
            cu[51] = thermalNotes;
            cu[52] = techNotes1;
            cu[53] = techNotes2;
            cu[54] = genNotes; 
            
            

            
        /*    System.out.println( cuID + "\t" + 
                                cuName + "\t" +                     
                                dataProcessor + "\t" +
                                inactive + "\t" + 
                                city + "\t" + 
                                us_state + "\t" + 
                                contactName + "\t" + 
                                contactInfo + "\t" + 
                                eRecipts + "\t" + 
                        //        eReciptBranches + "\t" + 
                                emailEncryption + "\t" + 
                                emailEncryptionType + "\t" + 
                                emailEncryptionSeats + "\t" + 
                        //        brandedPortal + "\t" + 
                                sigSales + "\t" + 
                        //        DCN + "\t" + 
                        //        iDS + "\t" + 
                        //        serverIP + "\t" + 
                        //        serverName + "\t" + 
                        //        serverOS + "\t" + 
                                sqlInstance + "\t" + 
                                sqlVersion + "\t" + 
                        //        branchNumber + "\t" + 
                        //        cdVersion + "\t" + 
                        //        manageDBName + "\t" + 
                        //        tellerDBName + "\t" + 
                                eSign + "\t" + 
                                eSignType + "\t" + 
                                eSignSeats + "\t" + 
                        //        DMSLogin + "\t" + 
                        //        DMSPassword + "\t" + 
                        //        installPath + "\t" + 
                        //        managePurchaseDate + "\t" + 
                        //        tellerPurchaseDate + "\t" + 
                                scanID + "\t" + 
                                scanIDCount + "\t" + 
                                scanStation + "\t" + 
                                scanStationCount //+ "\t" +
                       //         scanPort + "\t" + 
                       //         transPort + "\t" + 
                       //         txtReceipts + "\t" + 
                       //         txtReceiptBranch + "\t" + 
                       //         SMS_Number + "\t" + 
                       //         laserSupportType + "\t" + 
                       //         thermalColor + "\t" + 
                       //         thermalMasking + "\t" + 
                       //         thermalFontSize + "\t" + 
                       //         thermalDuplicate + "\t" + 
                       //         thermalT_ck + "\t" + 
                       //         thermalEndorse_ck + "\t" + 
                       //         thermalDateLastPurchase + "\t" + 
                       //         thermalNotes + "\t" + 
                       //         techNotes1 + "\t" + 
                       //         techNotes2 + "\t" + 
                       //         genNotes
                                                        ); */
                
                
            /*    ResultSetMetaData md = rs.getMetaData(); 
                int colCount = md.getColumnCount();  

                for (int i = 1; i <= colCount ; i++){  
                    String col_name = md.getColumnName(i);  
                    System.out.println(col_name);  
                }  */
            //  int cuID = rs.getInt("cuID");
            //  String cuName = rs.getString("cuName");
            //  int row  = rs.getRow();
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                //int numPoints = rs.getInt("num_points");
            // System.out.format("%s, %s\n", cuID, cuName);
            //  System.out.format("%s, %s, %s\n", cuID,cuName,row);
            //System.out.println(rs.getInt(1)+" "+rs.getString(2));
            
            //System.out.format("%s\n", rowNum);
            System.out.format("%s\n", rowCount);
            
            table.setValueAt(cu[0], rowCount, 0);
            table.setValueAt(cu[1], rowCount, 1);
            table.setValueAt(cu[2], rowCount, 2);
            table.setValueAt(cu[3], rowCount, 3);
            table.setValueAt(cu[4], rowCount, 4);
            table.setValueAt(cu[5], rowCount, 5);
            table.setValueAt(cu[6], rowCount, 6);
            table.setValueAt(cu[7], rowCount, 7);
            table.setValueAt(cu[8], rowCount, 8);
            table.setValueAt(cu[9], rowCount, 9);
            table.setValueAt(cu[10], rowCount, 10);
            table.setValueAt(cu[11], rowCount, 11);
            table.setValueAt(cu[12], rowCount, 12);
            table.setValueAt(cu[13], rowCount, 13);
            table.setValueAt(cu[14], rowCount, 14);
            table.setValueAt(cu[15], rowCount, 15);
            table.setValueAt(cu[16], rowCount, 16);
            table.setValueAt(cu[17], rowCount, 17);
            table.setValueAt(cu[18], rowCount, 18);
            table.setValueAt(cu[19], rowCount, 19);
            table.setValueAt(cu[20], rowCount, 20);
            table.setValueAt(cu[21], rowCount, 21);
            table.setValueAt(cu[22], rowCount, 22);
            table.setValueAt(cu[23], rowCount, 23);
            table.setValueAt(cu[24], rowCount, 24);
            table.setValueAt(cu[25], rowCount, 25);
            table.setValueAt(cu[26], rowCount, 26);
            table.setValueAt(cu[27], rowCount, 27);
            table.setValueAt(cu[28], rowCount, 28);
            table.setValueAt(cu[29], rowCount, 29);
            table.setValueAt(cu[30], rowCount, 30);
            table.setValueAt(cu[31], rowCount, 31);
            table.setValueAt(cu[32], rowCount, 32);
            table.setValueAt(cu[33], rowCount, 33);
            table.setValueAt(cu[34], rowCount, 34);
            table.setValueAt(cu[35], rowCount, 35);
            table.setValueAt(cu[36], rowCount, 36);
            table.setValueAt(cu[37], rowCount, 37);
            table.setValueAt(cu[38], rowCount, 38);
            table.setValueAt(cu[39], rowCount, 39);
            table.setValueAt(cu[40], rowCount, 40);
            table.setValueAt(cu[41], rowCount, 41);
            table.setValueAt(cu[42], rowCount, 42);
            table.setValueAt(cu[43], rowCount, 43);
            table.setValueAt(cu[44], rowCount, 44);
            table.setValueAt(cu[45], rowCount, 45);
            table.setValueAt(cu[46], rowCount, 46);
            table.setValueAt(cu[47], rowCount, 47);
            table.setValueAt(cu[48], rowCount, 48);
            table.setValueAt(cu[49], rowCount, 49);
            table.setValueAt(cu[50], rowCount, 50);
            table.setValueAt(cu[51], rowCount, 51);
            table.setValueAt(cu[52], rowCount, 52);
            table.setValueAt(cu[53], rowCount, 53);
            table.setValueAt(cu[54], rowCount, 54); 
         
  /*      int[] indexs = table.getSelectedRows();
        Object[] row = new Object[4];
        for(int j = 0; j < indexs.length; j++)
        {
            row[0] = table.getValueAt(indexs[j], 0);

            row[1] = table.getValueAt(indexs[j], 1);

            row[2] = table.getValueAt(indexs[j], 2);

            row[3] = table.getValueAt(indexs[j], 3);

            table.addRow(row);
        } */
            
     /*       cuidJ[0] =  table.setValueAt(cu[0], rowCount, 0);
            cuidJ[1] =  table.setValueAt(cu[1], rowCount, 1);
            cuidJ[2] =  table.setValueAt(cu[2], rowCount, 2);
            cuidJ[3] =  table.setValueAt(cu[3], rowCount, 3);
            cuidJ[4] =  table.setValueAt(cu[4], rowCount, 4);
            cuidJ[5] =  table.setValueAt(cu[5], rowCount, 5);
            cuidJ[6] =  table.setValueAt(cu[6], rowCount, 6);
            cuidJ[7] =  table.setValueAt(cu[7], rowCount, 7);
            cuidJ[8] =  table.setValueAt(cu[8], rowCount, 8);
            cuidJ[9] =  table.setValueAt(cu[9], rowCount, 9);
            cuidJ[10] = table.setValueAt(cu[10], rowCount, 10);
            cuidJ[11] = table.setValueAt(cu[11], rowCount, 11);
            cuidJ[12] = table.setValueAt(cu[12], rowCount, 12);
            cuidJ[13] = table.setValueAt(cu[13], rowCount, 13);
            cuidJ[14] = table.setValueAt(cu[14], rowCount, 14);
            cuidJ[15] = table.setValueAt(cu[15], rowCount, 15);
            cuidJ[16] = table.setValueAt(cu[16], rowCount, 16);
            cuidJ[17] = table.setValueAt(cu[17], rowCount, 17);
            cuidJ[18] = table.setValueAt(cu[18], rowCount, 18);
            cuidJ[19] = table.setValueAt(cu[19], rowCount, 19);
            cuidJ[20] = table.setValueAt(cu[20], rowCount, 20);
            cuidJ[21] = table.setValueAt(cu[21], rowCount, 21);
            cuidJ[22] = table.setValueAt(cu[22], rowCount, 22);
            cuidJ[23] = table.setValueAt(cu[23], rowCount, 23);
            cuidJ[24] = table.setValueAt(cu[24], rowCount, 24);
            cuidJ[25] = table.setValueAt(cu[25], rowCount, 25);
            cuidJ[26] = table.setValueAt(cu[26], rowCount, 26);
            cuidJ[27] = table.setValueAt(cu[27], rowCount, 27);
            cuidJ[28] = table.setValueAt(cu[28], rowCount, 28);
            cuidJ[29] = table.setValueAt(cu[29], rowCount, 29);
            cuidJ[30] = table.setValueAt(cu[30], rowCount, 30);
            cuidJ[31] = table.setValueAt(cu[31], rowCount, 31);
            cuidJ[32] = table.setValueAt(cu[32], rowCount, 32);
            cuidJ[33] = table.setValueAt(cu[33], rowCount, 33);
            cuidJ[34] = table.setValueAt(cu[34], rowCount, 34);
            cuidJ[35] = table.setValueAt(cu[35], rowCount, 35);
            cuidJ[36] = table.setValueAt(cu[36], rowCount, 36);
            cuidJ[37] = table.setValueAt(cu[37], rowCount, 37);
            cuidJ[38] = table.setValueAt(cu[38], rowCount, 38);
            cuidJ[39] = table.setValueAt(cu[39], rowCount, 39);
            cuidJ[40] = table.setValueAt(cu[40], rowCount, 40);
            cuidJ[41] = table.setValueAt(cu[41], rowCount, 41);
            cuidJ[42] = table.setValueAt(cu[42], rowCount, 42);
            cuidJ[43] = table.setValueAt(cu[43], rowCount, 43);
            cuidJ[44] = table.setValueAt(cu[44], rowCount, 44);
            cuidJ[45] = table.setValueAt(cu[45], rowCount, 45);
            cuidJ[46] = table.setValueAt(cu[46], rowCount, 46);
            cuidJ[47] = table.setValueAt(cu[47], rowCount, 47);
            cuidJ[48] = table.setValueAt(cu[48], rowCount, 48);
            cuidJ[49] = table.setValueAt(cu[49], rowCount, 49);
            cuidJ[50] = table.setValueAt(cu[50], rowCount, 50);
            cuidJ[51] = table.setValueAt(cu[51], rowCount, 51);
            cuidJ[52] = table.setValueAt(cu[52], rowCount, 52);
            cuidJ[53] = table.setValueAt(cu[53], rowCount, 53);
            cuidJ[54] = table.setValueAt(cu[54], rowCount, 54); */
            
            if (table.getPreferredSize().width < table.getParent().getWidth()) table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
            
                 
            rowCount =+ rowNum;
            //table.setValueAt(cu[rowCount], rowNum-1, rowCount);
            //System.out.print("loop");

            
          }
            //for(i=0; i<55; i++) table.setValueAt(cu[i], i, i);
            

            System.out.format("%s\n", rowCount);
            con.close();
        } catch(Exception e) { System.out.println(e); }
      
    }

    
    /*
    public static void popComboBox(JComboBox comboBox){
        String[] cuNames = null;
        int index = 0;
        int rowNum = 0;
        Statement st = Connect.go();
        ResultSet rs;
        
        try {
            
            rs = st.executeQuery("SELECT cuName FROM credit_union;");
            rowNum = Coral.getRowNum(rs);
            
            cuNames = new String[rowNum-1];
            
            for(int i = 0; i < rowNum; i++){
                cuNames[index] = rs.getString("cuName");
            }

        } catch (Exception e) { System.out.println(e); }

        DefaultComboBoxModel model = new DefaultComboBoxModel(cuNames);
        comboBox.setModel(model);
    }

    
    /*
    public static void popComboBox(JComboBox comboBox){
        String[] cuNames = null;
        int index = 0;
        int rowNum = 0;
        Statement st = Connect.go();
        ResultSet rs;
        
        try {
            
            rs = st.executeQuery("SELECT cuName FROM credit_union;");
            rowNum = Coral.getRowNum(rs);
            
            cuNames = new String[rowNum-1];
            
            for(int i = 0; i < rowNum; i++){
                cuNames[index] = rs.getString("cuName");
            }

        } catch (Exception e) { System.out.println(e); }

        DefaultComboBoxModel model = new DefaultComboBoxModel(cuNames);
        comboBox.setModel(model);
    }

    */

}

