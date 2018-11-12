/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author petervs
 */
public class OracleAdapter implements IDBAdapter{

    static {
        try {
            new OracleDriver();
        } catch (Exception e) {
        }
    }

    @Override
    public Connection getConnection() {
        try {
            String urlConnection = getConnectionString();
            String user = "system";
            String password = "1234";
            Connection connection = DriverManager.getConnection(urlConnection, user, password);
            System.out.println("Connection class: "+connection.getClass().getCanonicalName());
            return connection;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public String getConnectionString(){
        return "jdbc:oracle:thin:@localhost:1521:XE";
    }
    
}
