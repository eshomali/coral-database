//------------------------------------------------------------------------------
//  thermalPrinter.java
//  |   This class represents the thermal table in the the MySQL database.
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
public class thermalPrinter {
    
    //---Constants--------------------------------------------------------------
    public static final int COLNUM = 4; //DOES NOT INCLUDE tID (because we 
                                        //don't want to show this to the user)
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    //  thermalP()
    //  |   This method populates a JTable with all of the records in the 
    //  |   thermal table that have a cuID = cuidVar. 
    //--------------------------------------------------------------------------
    public static void thermalP(int cuidVar, JTable table){
        
        //---Variables----------------------------------------------------------
        String[] th = new String[COLNUM];
        int rowCount = 0;
        //----------------------------------------------------------------------
        
        try {
            
            //Create the result set
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT * FROM thermal "
                    + "WHERE cuID = " + cuidVar);
            //rowCount = Coral.getRowNum(rs);
            
            //Set up the table model
            DefaultTableModel model = new DefaultTableModel(0, COLNUM);
            table.setModel(model);
            
            //Start at the beginning of the result set
            rs.absolute(0);
            
            //Iterate through the result set
            while(rs.next()) {
                
                //Set up the th[] array
                String cuID = Integer.toString(rs.getInt("cuID"));
                String serialNumber = rs.getString("serialNumber");
                String moduleT = rs.getString("moduleT");
                String purchaseDate = rs.getString("purchaseDate");
                
                th[0] = cuID;
                th[1] = serialNumber;
                th[2] = moduleT;
                th[3] = purchaseDate;
                
                //Add this record to the database.
                model.addRow(th);
                
                if (table.getPreferredSize().width < table.getParent().getWidth()){
                    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                } else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);  
            }
            Connect.close();
        } catch(Exception e) { System.out.println(e); }
    }
}
