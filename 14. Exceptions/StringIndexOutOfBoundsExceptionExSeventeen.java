public class StringIndexOutOfBoundsExceptionExSeventeen {

    public static void main(String[] args) {
        try {
            // Attempting to access an index that is out of bounds for the string
            String name = "Tarique";
            char character = name.charAt(10);  // This line will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
