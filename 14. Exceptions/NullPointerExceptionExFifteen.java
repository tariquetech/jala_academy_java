public class NullPointerExceptionExFifteen {

    public static void main(String[] args) {
        try {
            // Attempting to access a method of a null object
            String str = null;
            int length = str.length();  // This line will throw NullPointerException
        } catch (NullPointerException e) {
            // Catching and handling the exception
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
