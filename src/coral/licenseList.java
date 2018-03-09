//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------

package coral;

import java.sql.*;
/**
 *
 * @author essa.shomali
 */
public class licenseList {
    
    public static void license(String licenseVar){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
            
            String query = String.format("SELECT * from %s", licenseVar);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) { 
              
              int cuID = rs.getInt("cuID");
              int productID = rs.getInt("productID");
              Date licenseChange = rs.getDate("licenseChange");
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                //int numPoints = rs.getInt("num_points");
                //System.out.format("%s, %s\n", cuID, cuName);
            System.out.format("%s, %s, %s\n", cuID, productID, licenseChange);
           //System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();
        } catch(Exception e) { System.out.println(e); }
    }
    
}
