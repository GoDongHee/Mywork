package com.babzyee.human;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;
public class OracleConnectionTest {
    private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
    private static final String URL ="jdbc:oracle:thin:@localhost:1521:orcl"; 
    private static final String USER ="mywork";
    private static final String PW ="mywork";
    
    @Test
    public void testConnect() throws Exception{
        
        Class.forName(DRIVER);
        
        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            
            System.out.println(con);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
                    
}

