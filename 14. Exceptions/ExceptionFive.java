public class ExceptionFive {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            // If age is negative, throw an InvalidAgeException with a custom message
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            // Call the method with different ages
            checkAge(25);  // Valid age
            checkAge(-5);  // Throws InvalidAgeException
        } catch (InvalidAgeException ex) {
            // Catch block to handle InvalidAgeException
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
