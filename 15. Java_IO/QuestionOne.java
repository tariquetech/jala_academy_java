import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QuestionOne {
    public static void main(String[] args) {

        String filePath = "myfile.txt";

        try {
            // Create an InputStream from the file
            InputStream inputStream = new FileInputStream(filePath);

            // Create a BufferedReader to read text efficiently
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // Read and print each line from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
