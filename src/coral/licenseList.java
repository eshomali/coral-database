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
    //--------------------------------------------------------------------------
    //  license()
    //  |   This method populates a JTable with all of the records in the 
    //  |   license table that have cuID = cuidVar.
    //--------------------------------------------------------------------------
    public static void license(int cuidVar, JTable table){
        
        //---Variables----------------------------------------------------------
        String[] lic, columnNames;
        int colNum;
        //----------------------------------------------------------------------
        
        try {
            //Create the result set and its metadata
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT * FROM licenses "
                    + "WHERE cuID = " + cuidVar);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            //Set up the variables
            colNum = Coral.getColNum(rs);
            columnNames = new String[colNum];
            lic = new String[colNum];
            
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
                
                //Set up the lic[] array
                lic[0] = Integer.toString(rs.getInt("licID"));
                lic[1] = Integer.toString(rs.getInt("cuID"));
                lic[2] = Integer.toString(rs.getInt("proID"));
                lic[3] = Integer.toString(rs.getInt("licenseChange"));
                lic[4] = rs.getString("DOC");
                
                //Add this record to the table
                model.addRow(lic);
                
                //Set up column resizing
                if (table.getPreferredSize().width < table.getParent().getWidth()) table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                else table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
            }
            
            //Close the connection
            Connect.close();
            
        } catch (Exception e) { System.out.println(e); }
    }
}
