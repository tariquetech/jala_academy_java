import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class QuestionNine {
    public static void main(String[] args) {
        String filePath = "config.properties";

        // Create a Properties object to store key-value pairs
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            // Load the properties from the file
            properties.load(fileInputStream);

            // Get values using keys
            String databaseUrl = properties.getProperty("database.url");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            // Display the values
            System.out.println("Database URL: " + databaseUrl);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
