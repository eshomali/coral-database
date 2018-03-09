//------------------------------------------------------------------------------
//  creditUnion.java
//  |   This class represents the credit_union table in the MySQL database.
//------------------------------------------------------------------------------

package coral;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
            
            while(rs.next()) { 
              
              int cuID = rs.getInt("cuID");
              String cuName = rs.getString("cuName");
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                //int numPoints = rs.getInt("num_points");
                //System.out.format("%s, %s\n", cuID, cuName);
            System.out.format("%s, %s\n", cuID, cuName);
           //System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();
        } catch(Exception e) { System.out.println(e); }
    }
    
    /*
    public static void popComboBox(JComboBox comboBox){
        String[] cuNames = null;
        int index = 0;
        int rowNum = 0;
        Statement st = Connect.go();
        ResultSet rs;
        
        try {
            
            rs = st.executeQuery("SELECT cuName FROM credit_union;");
            rowNum = Coral.getRowNum(rs);
            
            cuNames = new String[rowNum-1];
            
            for(int i = 0; i < rowNum; i++){
                cuNames[index] = rs.getString("cuName");
            }

        } catch (Exception e) { System.out.println(e); }

        DefaultComboBoxModel model = new DefaultComboBoxModel(cuNames);
        comboBox.setModel(model);
    }
    */
}

