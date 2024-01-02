public class ExceptionSix {

    static void validateAmount(double amount) throws CustomException {
        if (amount < 0) {
            // If amount is negative, throw a CustomException with a custom message
            throw new CustomException("Amount cannot be negative");
        }
        System.out.println("Valid amount: $" + amount);
    }

    public static void main(String[] args) {
        try {
            // Call the method with different amounts
            validateAmount(1000.50);  // Valid amount
            validateAmount(-500.75);  // Throws CustomException
        } catch (CustomException ex) {
            // Catch block to handle CustomException
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}