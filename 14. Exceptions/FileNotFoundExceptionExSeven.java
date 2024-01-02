import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExSeven {

    public static void main(String[] args) {
        try {
            // Try to open a file that does not exist
            FileReader fileReader = new FileReader("student.txt");
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException and print the stack trace
            e.printStackTrace();
        }
    }
}