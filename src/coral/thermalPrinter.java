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
    //--------------------------------------------------------------------------
    //  thermalP()
    //  |   This method populates a JTable with all of the records in the 
    //  |   thermal table that have a cuID = cuidVar. 
    //--------------------------------------------------------------------------
    public static void thermalP(int cuidVar, JTable table){
        
        //---Variables----------------------------------------------------------
        String[] th, columnNames;
        int colNum;
        //----------------------------------------------------------------------
        
        try {
            //Create the result set and its metadata
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT * FROM thermal "
                    + "WHERE cuID = " + cuidVar);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            //Set up the variables
            colNum = (Coral.getColNum(rs));
            columnNames = new String[colNum];
            th = new String[colNum];
            
            //Determine the column names
            for(int i = 0; i < colNum; i++){
                columnNames[i] = rsmd.getColumnName(i+1);
            }
            
            //Set up the table model
            DefaultTableModel model = new DefaultTableModel(0, colNum);
            model.setColumnIdentifiers(columnNames);
            table.setModel(model);
            
            //Start at the beginning of the result set
            rs.absolute(0);
            
            //Iterate through the result set
            while(rs.next()) {
                
                //Set up the th[] array
                th[0] = Integer.toString(rs.getInt("tID"));
                th[1] = Integer.toString(rs.getInt("cuID"));
                th[2] = rs.getString("serialNumber");
                th[3] = rs.getString("moduleT");
                th[4] = rs.getString("purchaseDate");
                
                //Add this record to the table
                model.addRow(th);
                
                if (table.getPreferredSize().width < table.getParent().getWidth()){
                    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                } else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);  
            }
            
            //Close the connection
            Connect.close();
            
        } catch(Exception e) { System.out.println(e); }
    }
}
