public class NumberFormatExceptionExSixteen {

    public static void main(String[] args) {
        try {
            // Attempting to convert a non-numeric string to an integer
            String nonNumericString = "abc";
            int number = Integer.parseInt(nonNumericString);  // This line will throw NumberFormatException
        } catch (NumberFormatException e) {
            // Catching and handling the exception
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}