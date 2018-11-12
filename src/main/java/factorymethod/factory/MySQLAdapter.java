/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author petervs
 */
public class MySQLAdapter implements IDBAdapter{
    
    static {
        try {
            new com.mysql.jdbc.Driver();
        } catch (Exception e) {
        }
    }

    @Override
    public Connection getConnection() {
        try {
            String urlConnection = getConnectionString();
            String user = "root";
            String password = "mysqlroot";
            Connection connection = DriverManager.getConnection(urlConnection, user, password);
            System.out.println("Connection class: "+connection.getClass().getCanonicalName());
            return connection;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public String getConnectionString(){
        return "jdbc:mysql://localhost:3306/mysql?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//        return "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
    }
    
}
