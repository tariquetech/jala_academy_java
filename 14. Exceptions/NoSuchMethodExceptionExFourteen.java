public class NoSuchMethodExceptionExFourteen {

    // A class with a field
    public static class Student {
        public int id;
        public String getName(){
            return "Mohammad Tarique";
        }
    }

    public static void main(String[] args) {
        try {
            // Trying to access a non-existent field
            Class<?> clazz = Student.class;
            clazz.getDeclaredMethod("getId");
        } catch (NoSuchMethodException e) {
            // Catching and handling the exception
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }
    }
}