//------------------------------------------------------------------------------
//  creditUnion.java
//  |   This class represents the credit_union table in the MySQL database.
//------------------------------------------------------------------------------

package coral;

//---Imports--------------------------------------------------------------------
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//------------------------------------------------------------------------------
/**
 *
 * @author essa.shomali
 */
public class creditUnion {
    
    //---Constants--------------------------------------------------------------
    public static final int COLNUM = 55;
    //--------------------------------------------------------------------------
    
    public static void creditU(int cuidVar, JTable table){
        
        //---Variables----------------------------------------------------------
        String[] cu = new String[COLNUM];
        String[] columnNames = new String[COLNUM];
        //----------------------------------------------------------------------
       
        try {
            //Create the result set and its metadata 
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT * FROM credit_union "
                    + "WHERE cuID = " + cuidVar);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            //Determine the column names
            for(int i = 0; i < COLNUM; i++){
                columnNames[i] = rsmd.getColumnName(i+1);
            }
            
            //Set up the table model
            DefaultTableModel model = new DefaultTableModel(0, COLNUM);
            model.setColumnIdentifiers(columnNames);
            table.setModel(model);

            //Start at the beginning of the result set
            rs.absolute(0);
            
            //Iterate through the result set
            while(rs.next()){
                //Set up the cu[] array
                cu[0] = Integer.toString(rs.getInt("cuID"));
                cu[1] = rs.getString("cuName");
                cu[2] = rs.getString("dataProcessor");
                cu[3] = rs.getString("inactive");
                cu[4] = rs.getString("city");
                cu[5] = rs.getString("us_state");
                cu[6] = rs.getString("contactName");
                cu[7] = rs.getString("contactInfo");
                cu[8] = rs.getString("eRecipts");
                cu[9] = rs.getString("eReciptBranches");
                cu[10] = rs.getString("emailEncryption");
                cu[11] = rs.getString("emailEncryptionType");
                cu[12] = rs.getString("emailEncryptionSeats");
                cu[13] = rs.getString("brandedPortal");
                cu[14] = rs.getString("sigSales");
                cu[15] = rs.getString("DCN");
                cu[16] = rs.getString("iDS");
                cu[17] = rs.getString("serverIP");
                cu[18] = rs.getString("serverName");
                cu[19] = rs.getString("serverOS");
                cu[20] = rs.getString("sqlInstance");
                cu[21] = rs.getString("sqlVersion");
                cu[22] = rs.getString("branchNumber");
                cu[23] = rs.getString("cdVersion");
                cu[24] = rs.getString("manageDBName");
                cu[25] = rs.getString("tellerDBName");
                cu[26] = rs.getString("eSign");
                cu[27] = rs.getString("eSignType");
                cu[28] = rs.getString("eSignSeats");
                cu[29] = rs.getString("DMSLogin");
                cu[30] = rs.getString("DMSPassword");
                cu[31] = rs.getString("installPath");
                cu[32] = rs.getString("managePurchaseDate");
                cu[33] = rs.getString("tellerPurchaseDate");
                cu[34] = rs.getString("scanID");
                cu[35] = rs.getString("scanIDCount");
                cu[36] = rs.getString("scanStation");
                cu[37] = rs.getString("scanStationCount");
                cu[38] = rs.getString("scanPort");
                cu[39] = rs.getString("transPort");
                cu[40] = rs.getString("txtReceipts");
                cu[41] = rs.getString("txtReceiptBranch");
                cu[42] = rs.getString("SMS_Number");
                cu[43] = rs.getString("laserSupportType");
                cu[44] = rs.getString("thermalColor");
                cu[45] = rs.getString("thermalMasking");
                cu[46] = rs.getString("thermalFontSize");
                cu[47] = rs.getString("thermalDuplicate");
                cu[48] = rs.getString("thermalT_ck");
                cu[49] = rs.getString("thermalEndorse_ck");
                cu[50] = rs.getString("thermalDateLastPurchase");
                cu[51] = rs.getString("thermalNotes");
                cu[52] = rs.getString("techNotes1");
                cu[53] = rs.getString("techNotes2");
                cu[54] = rs.getString("genNotes");
                
                //Add this record to the table
                model.addRow(cu);
                
                //Set up the column resizing
                if (table.getPreferredSize().width < table.getParent().getWidth()) table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
            }
            
            //Close the connection
            Connect.close();
            
        } catch(Exception e) { System.out.println(e); }    
    }
}

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
                                                        ); 
*/

/*    ResultSetMetaData md = rs.getMetaData(); 
                int colCount = md.getColumnCount();  

                for (int i = 1; i <= colCount ; i++){  
                    String col_name = md.getColumnName(i);  
                    System.out.println(col_name);  
                }  
*/

//  int cuID = rs.getInt("cuID");
//  String cuName = rs.getString("cuName");
//  int row  = rs.getRow();
    //Date dateCreated = rs.getDate("date_created");
    //boolean isAdmin = rs.getBoolean("is_admin");
    //int numPoints = rs.getInt("num_points");
// System.out.format("%s, %s\n", cuID, cuName);
//  System.out.format("%s, %s, %s\n", cuID,cuName,row);
//System.out.println(rs.getInt(1)+" "+rs.getString(2));

/*      int[] indexs = table.getSelectedRows();
        Object[] row = new Object[4];
        for(int j = 0; j < indexs.length; j++)
        {
            row[0] = table.getValueAt(indexs[j], 0);

            row[1] = table.getValueAt(indexs[j], 1);

            row[2] = table.getValueAt(indexs[j], 2);

            row[3] = table.getValueAt(indexs[j], 3);

            table.addRow(row);
        } 
*/

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
            cuidJ[54] = table.setValueAt(cu[54], rowCount, 54); 
*/