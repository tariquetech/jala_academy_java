import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class QuestionTwo {
    public static void main(String[] args) {
        // Specify the path to your .txt file
        String filePath = "myfile.txt";

        try {
            // Create an OutputStream to write to the file
            OutputStream outputStream = new FileOutputStream(filePath);

            // Create a BufferedWriter to write text efficiently
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

            // Write text to the file
            writer.write("Hello, this is a sample text.\n");
            writer.write("Writing to a text file using Java.");

            // Close the resources
            writer.close();
            outputStream.close();

            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
