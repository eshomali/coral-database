//------------------------------------------------------------------------------
//
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
public class licenseList {
    
    //---Constants--------------------------------------------------------------
    public static final int COLNUM = 5;
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    //  license()
    //  |   This method populates a JTable with all of the records in the 
    //  |   license table that have cuID = cuidVar.
    //--------------------------------------------------------------------------
    public static void license(int cuidVar, JTable table){
        
        //---Variables----------------------------------------------------------
        int rowCount = 0;
        String[] lic = new String[COLNUM];
        //----------------------------------------------------------------------
        
        try {
            //Create the result set
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT * FROM licenses "
                    + "WHERE cuID = " + cuidVar);
            rowCount = Coral.getRowNum(rs);
            
            //Set up the table model
            DefaultTableModel model = new DefaultTableModel(0, COLNUM);
            table.setModel(model);
            
            //Start at the beginning of the result set
            rs.absolute(0);
            
            //Iterate through the result set
            while(rs.next()) {
                
                //Set up the lic[] array
                String licID = Integer.toString(rs.getInt("licID"));
                String cuID = Integer.toString(rs.getInt("cuID"));
                String proID = Integer.toString(rs.getInt("proID"));
                String licenseChange = Integer.toString(rs.getInt("licenseChange"));
                String DOC = rs.getString("DOC");
                
                lic[0] = licID;
                lic[1] = cuID;
                lic[2] = proID;
                lic[3] = licenseChange;
                lic[4] = DOC;
                
                //Add this record to the database
                model.addRow(lic);
                
                //Set up column resizing
                if (table.getPreferredSize().width < table.getParent().getWidth()) table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
            }
        } catch (Exception e) { System.out.println(e); }
    }
}
