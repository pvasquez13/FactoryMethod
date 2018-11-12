
import factorymethod.factory.MySQLAdapter;
import factorymethod.factory.OracleAdapter;
import java.sql.Connection;

/**
 *
 * @author petervs
 */
public class Main {
    public static void main(String[] args) {
        MySQLAdapter adapter = new MySQLAdapter();
        Connection connection = adapter.getConnection();
    }
    
}
