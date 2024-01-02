import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionEight {
    public static void main(String[] args) {
        // Specify the path to your .txt file
        String filePath = "myfile.txt";

        try {
            // Create a FileWriter to write to the file (true indicates append mode)
            FileWriter fileWriter = new FileWriter(filePath, true);

            // Wrap the FileWriter in a BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write text to the file
            String textToWrite = "Hello, this is a line of text!";
            bufferedWriter.write(textToWrite);
            bufferedWriter.newLine(); // Add a newline character

            // Close the BufferedWriter and FileWriter to flush and release resources
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Text has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
