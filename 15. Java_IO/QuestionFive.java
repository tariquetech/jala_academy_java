import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuestionFive {
    public static void main(String[] args) {
        // Specify the path to your .txt file
        String filePath = "myfile.txt";

        try {
            // Create a FileReader to read from the file
            FileReader fileReader = new FileReader(filePath);

            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader reader = new BufferedReader(fileReader);

            // Read text from the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            reader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
