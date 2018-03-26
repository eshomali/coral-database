//------------------------------------------------------------------------------
//  Coral.java
//  |   This class hold static methods that are used frequently throughout 
//  |   the program. 
//------------------------------------------------------------------------------

package coral;

//---Imports--------------------------------------------------------------------
import java.sql.*;
import javax.swing.JComboBox;
//------------------------------------------------------------------------------

/**
 *
 * @author essa.shomali
 */
public class Coral {

    //--------------------------------------------------------------------------
    //  getRowNum()
    //  |   Returns the number of rows in the result set
    //--------------------------------------------------------------------------
    public static int getRowNum(ResultSet rs) {

        int rowNum = 0;

        try {
            //Iterate through the result set
            rs.first();
            while(rs.next()){
                //Saves the current row into rowNum
                rowNum =+ rs.getRow();
            }
            //Once the while loop has been completed, rowNum will contain
            //the last row number (which is the same as the number of rows)
        } catch (Exception e) { System.out.println(e); }
        
        return rowNum;

    }
    
    //--------------------------------------------------------------------------
    //  getColNum()
    //  |   Returns the number of columns in the result set
    //--------------------------------------------------------------------------
    public static int getColNum(ResultSet rs) {
        
        //Initialize variables
        int x = 0;
        
        try {
            //Retrieve the column count
            x = rs.getMetaData().getColumnCount();
        } catch (Exception e) { System.out.println(e); }
        
        return x;
    }
    
    //--------------------------------------------------------------------------
    //  to1DStrArray()
    //  |   Returns a string array containing the elements of the result set
    //  |   obtained by executing the query... 
    //  |       SELECT  colName  FROM  tableName
    //--------------------------------------------------------------------------
    public static String[] to1DStrArray(ResultSet rs) {
        
        //Initialize variables
        int rowNum = Coral.getRowNum(rs);
        int index = 0;
        String[] output = new String[rowNum];
        
        try {
            //Set the result set cursor to the first row
            rs.absolute(0);
            //Iterate through the result set
            while(rs.next()){
                //Retrieve the value from the result set and store it into the
                //output array
                output[index] = rs.getString(1);
                //Increment the index so for the next row it will save the 
                //value into the next available space in output[]
                index++;
            }
        } catch (Exception e) { System.out.println(e); }
        
        return output;
    }
    
    //--------------------------------------------------------------------------
    //  selectedcuID()
    //  |   This method takes a passed JComboBox (one populated using the credit
    //  |   union names from the database) and returns the cuID of the
    //  |   selected credit union.
    //--------------------------------------------------------------------------
    public static int selectedCUID(JComboBox comboBox){
       
        //---Variables----------------------------------------------------------
        String input;
        int output = -1;
        //----------------------------------------------------------------------
    
        //Get input from comboBox
        input = (comboBox.getSelectedItem()).toString();
        
        //Determine the selected credit union's cuID
        try {
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery("SELECT cuID FROM credit_union "
                    + "WHERE cuName = '" + input + "'");
            rs.first();
            output = rs.getInt("cuID");
            
            Connect.close();
        } catch (Exception e) { System.out.println(e); }
        
        return output;
    }
}
