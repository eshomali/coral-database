//------------------------------------------------------------------------------
//  THIS CLASS IS FOR WRITING CODE TO TEST OTHER PARTS OF THE PROJECT.
//------------------------------------------------------------------------------

package coral;

import java.sql.*;

public class TESTING {
    public static void main(String[] args) {
        
        Statement st = Connect.go();
        ResultSet rs = null;
        int x = 0;
        try {
            rs = st.executeQuery("SELECT * FROM credit_union");
            x = Coral.getColNum(rs);
        } catch (Exception e) { System.out.println(e); }
        
        System.out.println(x);
        
        
    }
}
