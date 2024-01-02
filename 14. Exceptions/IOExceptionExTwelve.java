import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExTwelve {

    public static void main(String[] args) {
        try {
            // Try to read from a file that does not exist
            BufferedReader reader = new BufferedReader(new FileReader("NonExistentFile.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            // Catch the IOException and print the stack trace
            e.printStackTrace();
        }
    }
}