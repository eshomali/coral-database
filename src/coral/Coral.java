/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

import java.sql.*;

/**
 *
 * @author essa.shomali
 */
public class Coral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from credit_union");
            while(rs.next()) 
            System.out.println(rs.getInt(1) + rs.getInt(2));  
            con.close();  
                //int cuID = rs.getInt("cuID");
                //String cuName = rs.getString("cuName");
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                //int numPoints = rs.getInt("num_points");
                //System.out.format("%s, %s\n", cuID, cuName);
            //con.close();
        } catch(Exception e) { System.out.println(e); }
        
        
        
    }
    
}
