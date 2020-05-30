import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connection getMyConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourists?autoReconnect=true&useSSL=false", "root", "mysql");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}