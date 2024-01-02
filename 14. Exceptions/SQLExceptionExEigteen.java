import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExEigteen {

    public static void main(String[] args) {
        try {
            // Attempting to connect to a non-existent database
            String url = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // Catching and handling the SQLException
            System.out.println("Caught SQLException: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
        }
    }
}