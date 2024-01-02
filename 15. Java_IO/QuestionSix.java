import java.io.FileWriter;
import java.io.IOException;

public class QuestionSix {
    public static void main(String[] args) {
        // Specify the path to your .txt file
        String filePath = "myfile.txt";

        try {
            // Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Write text to the file
            fileWriter.write("Hello, this is a sample text.\n");
            fileWriter.write("You can write more lines to this file.");

            // Close the FileWriter to flush and release resources
            fileWriter.close();

            System.out.println("Text has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
