
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
            
            table.setValueAt(rs.getInt("productID"), rowNum-1, 0);
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
    //  Updates information in the products table where...
    //      data = the new product name
    //      r = the productID of the product that needs to be updated
    //--------------------------------------------------------------------------
    public void update(Object data, int r){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
            
            Statement st = con.createStatement();
            st.executeUpdate(
                    "UPDATE products SET productType = '" + data + 
                            "' WHERE productID = " + r + ";"
            );
            
            con.close();
            
        } catch (Exception e) { System.out.println(e); }
    }
}
