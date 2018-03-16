//------------------------------------------------------------------------------
//  productList.java
//  |   This class represents the products table in the MySQL database.
//------------------------------------------------------------------------------


package coral;

import javax.swing.JTable;
import java.sql.*;

public class productList {
    
    public static void product(String productVar, JTable table){
        
        int rowCount = 0;
        
        try {
            String query = String.format("SELECT * from %s", productVar);    
            Statement st = Connect.go();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {  
            //------------------------------------------------------------------
            //  Format the values into the JTable
            //------------------------------------------------------------------
            int rowNum = rs.getRow();
            
            //table.setValueAt(rs.getInt("productID"), rowNum-1, 0);
              table.setValueAt(rs.getString("productType"), rowNum-1, 1);
            
            /*
            //------------------------------------------------------------------
            //  Prints the values in csv format in the console
            //------------------------------------------------------------------
              int productID = rs.getInt("productID");
              String productType = rs.getString("productType");
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                //int numPoints = rs.getInt("num_points");
                //System.out.format("%s, %s\n", cuID, cuName);
            System.out.format("%s, %s\n", productID, productType);
           //System.out.println(rs.getInt(1)+" "+rs.getString(2));
           */
            
            //Saves the most recent row number, so when rs.next() returns false
            //rowCount will hold the last row number (which is also the number
            //of rows in the table)
            rowCount =+ rowNum;
            
            }
            System.out.format("%s\n", rowCount);
            
            Connect.close();
        } catch(Exception e) { System.out.println(e); }
    }
    
    //--------------------------------------------------------------------------
    //  update()
    //  |   Updates information in the products table where...
    //  |      data = the new product name
    //  |      r = the productID of the product that needs to be updated
    //--------------------------------------------------------------------------
    public static void update(Object data, int r){
        try {
            Statement st = Connect.go();
            st.executeUpdate(
                    "UPDATE products SET productType = '" + data + 
                            "' WHERE productID = " + r + ";"
            );
        } catch (Exception e) { System.out.println(e); }
        finally {
            Connect.close();
        }
    }
    
    //--------------------------------------------------------------------------
    //  newRecord()
    //  |   Creates a new record in the products table where the name of the 
    //  |   product is newProduct. A productID is not necessary because the table 
    //  |   is auto-incremented.
    //--------------------------------------------------------------------------
    
    public static void newRecord(String newProduct){
        try { 
            Statement st = Connect.go();
            st.executeUpdate(
                    "INSERT INTO products(productType) VALUES ('" + 
                            newProduct + "');"
            );
            
        } catch(Exception e) { System.out.println(e); }
        finally {
            Connect.close();
        }
    }
    
    public static void deleteRecord() {
        try {
        
        } catch(Exception e) { System.out.println(e); }
    }
}
