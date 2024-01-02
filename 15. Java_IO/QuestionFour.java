import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class QuestionFour {
    public static void main(String[] args) {

        String filePath = "myfile.txt";

        try {
            // Create an OutputStream to write to the file
            OutputStream outputStream = new FileOutputStream(filePath);

            // Wrap the OutputStream in a BufferedOutputStream for efficient writing
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            // Wrap the BufferedOutputStream in an OutputStreamWriter to handle character encoding
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);

            // Wrap the OutputStreamWriter in a BufferedWriter for efficient writing of text
            BufferedWriter writer = new BufferedWriter(outputStreamWriter);

            // Write text to the file
            String text = "Hello, this is a sample text.";
            writer.write(text);

            // Close the resources
            writer.close();
            outputStreamWriter.close();
            bufferedOutputStream.close();
            outputStream.close();

            System.out.println("Text has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
