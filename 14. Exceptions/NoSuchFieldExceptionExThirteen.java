public class NoSuchFieldExceptionExThirteen {

    // A class with a field
    public static class Student {
        public int id;
    }

    public static void main(String[] args) {
        try {
            // Trying to access a non-existent field
            Class<?> clazz = Student.class;
            clazz.getDeclaredField("firstName");
        } catch (NoSuchFieldException e) {
            // Catching and handling the exception
            System.out.println("Caught NoSuchFieldException: " + e.getMessage());
        }
    }
}