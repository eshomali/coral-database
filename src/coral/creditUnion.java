/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

import java.sql.*;
import static coral.Model.main;
import javax.swing.JTextArea;
/**
 *
 * @author essa.shomali
 */
public class creditUnion {
    
    public static void creditU(String creditUnionVar){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/access","root","5755Troy!");
                
            String query = String.format("SELECT * from %s", creditUnionVar);    //credit_union
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){ 
                
                ResultSetMetaData md = rs.getMetaData(); 
                int colCount = md.getColumnCount();  

                for (int i = 1; i <= colCount ; i++){  
                    String col_name = md.getColumnName(i);  
                    System.out.println(col_name);  
                }
            //  int cuID = rs.getInt("cuID");
            //  String cuName = rs.getString("cuName");
            //  int row  = rs.getRow();
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                //int numPoints = rs.getInt("num_points");
            // System.out.format("%s, %s\n", cuID, cuName);
            //  System.out.format("%s, %s, %s\n", cuID,cuName,row);
            //System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();
        } catch(Exception e) { System.out.println(e); }
      
    }
}
