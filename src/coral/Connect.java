//------------------------------------------------------------------------------
//  Connection.java
//  |   This class is used to create or close the connection to the MySQL 
//  |   database. The output is a statement that can be used to execute 
//  |   queries.
//  |   REMEMBER: Call the close() method once you are finished with the 
//  |   connection you created using the go() method.
//------------------------------------------------------------------------------


package coral;

import java.sql.*;

public class Connect {
    
    static java.sql.Connection con = null;
    
    public static Statement go(){
        
        Statement st = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "access?useSSL=false","root","5755Troy!");
            
            st = con.createStatement();
        }catch(Exception e) { System.out.println(e); };
        
        return st;
    }
    
    public static void close(){
        try {
            con.close();
        }catch(Exception e) { System.out.println(e); };
    }
    
}
