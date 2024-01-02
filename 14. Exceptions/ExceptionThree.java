public class ExceptionThree {

    // Method that throws an exception
    public static void myMethod() throws Exception {
        throw new Exception("This is a checked exception.");
    }

    public static void main(String[] args) {
        // Calling the method without a try-catch block or throws declaration
        myMethod();
    }
}