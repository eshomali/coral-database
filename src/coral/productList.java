/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

import javax.swing.JTable;
import java.sql.*;

/**
 *
 * @author essa.shomali
 */




public class productList {
    
    //-----CONSTANTS------------------------------------------------------------
    public static final int columnNum = 2;
    //--------------------------------------------------------------------------
    //REMEMBER TO CHANGE IF TABLE IS CHANGED
    
    public static void product(String productVar, JTable table){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
            
            String query = String.format("SELECT * from %s", productVar);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) {  
            //------------------------------------------------------------------
            //  Print the values into a JTable
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
            }
            con.close();
        } catch(Exception e) { System.out.println(e); }
    }
    
}
