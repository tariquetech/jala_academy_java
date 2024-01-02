import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuestionSeven {
    public static void main(String[] args) {
        // Specify the path to your .txt file
        String filePath = "myfile.txt";

        try {
            // Create a FileReader to read from the file
            FileReader fileReader = new FileReader(filePath);

            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the text line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader and FileReader to release resources
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
