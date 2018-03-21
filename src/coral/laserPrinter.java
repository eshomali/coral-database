//------------------------------------------------------------------------------
//  creditUnion.java
//  |   This class represents the laser table in the MySQL database.
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
public class laserPrinter {
    
    //---Constants--------------------------------------------------------------
    public static final int COLNUM = 103;
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    //  laserP()
    //  |   This method populates the JTable with all of the records in the 
    //  |   laser table that have cuID = cuidVar.
    //--------------------------------------------------------------------------
    public static void laserP(int cuidVar, JTable table){
        
        //---Variables----------------------------------------------------------
        int rowCount = 0;
        String[] las = new String[COLNUM];
        //----------------------------------------------------------------------
        
        try {
            //Create the result set
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT * FROM laser "
                    + "WHERE cuID = " + cuidVar);
            rowCount = Coral.getRowNum(rs);
            
            //Set up the table model
            DefaultTableModel model = new DefaultTableModel(0, COLNUM);
            table.setModel(model);
            
            //Start at the beginning of the result set
            rs.absolute(0);
            
            //Iterate through the result set
            while(rs.next()){
                //Set up the lic[] array
                las[0] = Integer.toString(rs.getInt("lID"));
                las[1] = Integer.toString(rs.getInt("cuID"));
                las[2] = rs.getString("location");
                las[3] = rs.getString("adminPC");
                las[4] = rs.getString("PO");
                las[5]= rs.getString("warranty");
                las[6] = rs.getString("serialNumber");
                las[7] = Boolean.toString(rs.getBoolean("subscription"));
                las[8] = Boolean.toString(rs.getBoolean("active"));
                las[9] = Boolean.toString(rs.getBoolean("locking"));
                las[10] = rs.getString("orientation");
                las[11] = rs.getString("pitch");
                las[12] = rs.getString("LPP");
                las[13] = rs.getString("net_IP");
                las[14] = rs.getString("net_cfp");
                las[15] = rs.getString("net_lpt");
                las[16] = rs.getString("net_emul");    
                las[17] = rs.getString("par_IP");
                las[18] = rs.getString("par_cfp");
                las[19] = rs.getString("par_lpt");
                las[20] = rs.getString("par_emul");
                las[21] = rs.getString("printServerSerial");
                las[22] = Boolean.toString(rs.getBoolean("null_val"));
                las[23] = rs.getString("printPortON");
                las[24] = Boolean.toString(rs.getBoolean("lp_ck"));
                las[25] = rs.getString("lp_port");
                las[26] = rs.getString("lp_tray");
                las[27] = Boolean.toString(rs.getBoolean("inq_ck"));
                las[28] = rs.getString("inq_port");
                las[29] = rs.getString("inq_tray");
                las[30] = Boolean.toString(rs.getBoolean("report_ck"));
                las[31] = rs.getString("report_port");
                las[32] = rs.getString("report_tray");
                
                //---the following is of type LONGTEXT, may cause errors.-------
                las[33] = rs.getString("notes");
                //--------------------------------------------------------------
                
                las[34] = Boolean.toString(rs.getBoolean("netapps_ck"));
                las[35] = rs.getString("netapps_port");
                las[36] = rs.getString("netapps_tray");
                las[37] = Boolean.toString(rs.getBoolean("check_ck"));
                las[38] = rs.getString("check_port");
                las[39] = rs.getString("check_tray");
                las[40] = rs.getString("check_filename");
                las[41] = Boolean.toString(rs.getBoolean("cd_ck"));
                las[42] = rs.getString("cd_port");
                las[43] = rs.getString("cd_tray");
                las[44] = rs.getString("cd_filename");
                las[45] = Boolean.toString(rs.getBoolean("recpt_ck"));
                las[46] = rs.getString("recpt_port");
                las[47] = rs.getString("recpt_tray");
                las[48] = rs.getString("recpt_filename");
                las[49] = Boolean.toString(rs.getBoolean("other1_ck"));
                las[50] = Boolean.toString(rs.getBoolean("other1_formtype"));
                las[51] = rs.getString("other1_port");
                las[52] = rs.getString("other1_tray");
                las[53] = rs.getString("other1_filename");
                las[54] = Boolean.toString(rs.getBoolean("other2_ck"));
                las[55] = Boolean.toString(rs.getBoolean("other2_formtype"));
                las[56] = rs.getString("other2_port");
                las[57] = rs.getString("other2_tray");
                las[58] = rs.getString("other2_filename");
                las[59] = Boolean.toString(rs.getBoolean("LPC_ck"));
                las[60] = rs.getString("LPC_port");
                las[61] = rs.getString("LPC_tray");
                las[62] = rs.getString("LPC_filename");
                las[63] = Boolean.toString(rs.getBoolean("MA_ck"));
                las[64] = rs.getString("MA_port");
                las[65] = rs.getString("MA_tray");
                las[66] = rs.getString("MA_filename");
                las[67] = Boolean.toString(rs.getBoolean("NSF_ck"));
                las[68] = rs.getString("NSF_port");
                las[69] = rs.getString("NSF_tray");
                las[70] = rs.getString("NSF_filename");
                las[71] = Boolean.toString(rs.getBoolean("CP_ck"));
                las[72] = rs.getString("CP_port");
                las[73] = rs.getString("CP_tray");
                las[74] = rs.getString("CP_filename");
                las[75] = Boolean.toString(rs.getBoolean("NO_ck"));
                las[76] = rs.getString("NO_port");
                las[77] = rs.getString("NO_tray");
                las[78] = rs.getString("NO_filename");
                las[79] = Boolean.toString(rs.getBoolean("PD_ck"));
                las[80] = rs.getString("PD_port");
                las[81] = rs.getString("PD_tray");
                las[82] = rs.getString("PD_filename");
                las[83] = Boolean.toString(rs.getBoolean("CAN_ck"));
                las[84] = rs.getString("CAN_port");
                las[85] = rs.getString("CAN_tray");
                las[86] = rs.getString("CAN_filename");
                las[87] = Boolean.toString(rs.getBoolean("other3_ck"));
                las[88] = Boolean.toString(rs.getBoolean("other3_formtype"));
                las[89] = rs.getString("other3_port");
                las[90] = rs.getString("other3_tray");
                las[91] = rs.getString("other3_filename");
                las[92] = Boolean.toString(rs.getBoolean("other4_ck"));
                las[93] = Boolean.toString(rs.getBoolean("other4_formtype"));
                las[94] = rs.getString("other4_port");
                las[95] = rs.getString("other4_tray");
                las[96] = rs.getString("other4_filename");
                las[97] = Boolean.toString(rs.getBoolean("other5_ck"));
                las[98] = Boolean.toString(rs.getBoolean("other5_formtype"));
                las[99] = rs.getString("other5_port");
                las[100] = rs.getString("other5_tray");
                las[101] = rs.getString("other5_filename");

                //Add this record to the database
                model.addRow(las);
                
                //Set up the column resizing
                if (table.getPreferredSize().width < table.getParent().getWidth()) table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
            }
        } catch (Exception e) { System.out.println(e); }
        
    }
}
