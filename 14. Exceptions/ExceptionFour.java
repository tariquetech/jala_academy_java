public class ExceptionFour {

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Catch block for handling ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds exception: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            // Catch block for handling ArithmeticException
            System.out.println("Arithmetic exception: " + ex.getMessage());
        } catch (Exception ex) {
            // Generic catch block for handling other exceptions
            System.out.println("An unexpected exception occurred: " + ex.getMessage());
        }
    }
}