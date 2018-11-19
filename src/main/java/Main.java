
import factorymethod.factory.DBAdapterFactory;
import factorymethod.factory.IDBAdapter;
import java.sql.Connection;

/**
 *
 * @author petervs
 */
public class Main {
    public static void main(String[] args) {
//        MySQLAdapter adapter = new MySQLAdapter();

        IDBAdapter adapter = DBAdapterFactory.getAdapter();
        Connection connection = adapter.getConnection();
    }
    
}
