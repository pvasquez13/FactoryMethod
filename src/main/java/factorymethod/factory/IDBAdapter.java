package factorymethod.factory;

import java.sql.Connection;

/**
 *
 * @author petervs
 */
public interface IDBAdapter {
    
    public Connection getConnection();
}
