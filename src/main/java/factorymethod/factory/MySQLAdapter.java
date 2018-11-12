/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

import java.sql.Connection;

/**
 *
 * @author petervs
 */
public class MySQLAdapter implements IDBAdapter{

    @Override
    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
