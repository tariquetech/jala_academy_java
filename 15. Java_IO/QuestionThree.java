import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QuestionThree {
    public static void main(String[] args) {

        String filePath = "myfile.txt";

        try {
            // Create an InputStream to read from the file
            InputStream inputStream = new FileInputStream(filePath);

            // Wrap the InputStream in a BufferedInputStream for efficient reading
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            // Wrap the BufferedInputStream in an InputStreamReader to handle character encoding
            InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);

            // Wrap the InputStreamReader in a BufferedReader for efficient reading of text
            BufferedReader reader = new BufferedReader(inputStreamReader);

            // Read text from the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            reader.close();
            inputStreamReader.close();
            bufferedInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
