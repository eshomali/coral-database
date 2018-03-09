/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coral;

import java.sql.*;

public class TESTING {
    public static void main(String[] args) {
        Statement st = Connect.go();
        String[] test;
        
        try {
            
            ResultSet rs = st.executeQuery("SELECT cuName FROM credit_union");
            test = Coral.to1DStrArray(rs);
            
            for(int i = 0; i < 23; i++){
                System.out.println(test[i]);
            }
                    
        } catch (Exception e) { System.out.println("Y: " + e); }
    }
}
