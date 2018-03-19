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
                
                //Add this record to the database
                
                //Set up the column resizing
                if (table.getPreferredSize().width < table.getParent().getWidth()) table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
            }
        } catch (Exception e) { System.out.println(e); }
        
    }
}
