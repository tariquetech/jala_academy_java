public class ClassNotFoundExceptionExTen {

    public static void main(String[] args) {
        try {
            // Try to load a class that does not exist
            Class<?> myClass = Class.forName("StudentClass");
        } catch (ClassNotFoundException e) {
            // Catch the ClassNotFoundException and print the stack trace
            e.printStackTrace();
        }
    }
}