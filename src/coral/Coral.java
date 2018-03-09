//------------------------------------------------------------------------------
//  Coral.java
//  |   This class hold static methods that are used frequently throughout 
//  |   the program. 
//------------------------------------------------------------------------------

package coral;

import java.sql.*;

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
        int currentRow = 0;
        try {
            while(rs.next()){
                currentRow = rs.getRow();
                rowNum =+ currentRow;
            }
        } catch (Exception e) { System.out.println(e); }
        
        return rowNum;
    }
    
    //--------------------------------------------------------------------------
    //  to1DStrArray()
    //  |   Returns a string array containing the elements of rs
    //  |   EXCEPTION: rs must have ONLY ONE 
    //--------------------------------------------------------------------------
    public static String[] to1DStrArray(ResultSet rs) {
        int i = 0;
        int rowNum = 0;
        
        try {
            
            rowNum = Coral.getRowNum(rs);
            
        } catch (Exception e) { System.out.println(e); }
        
        String[] output = new String[rowNum];
        
        try {
            while(rs.next()) {
                output[i] = rs.getString(1);
                i++;
            }
        } catch (Exception e) { System.out.println(e); }
        
        return output;
    }
}    
