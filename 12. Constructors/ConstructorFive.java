public class ConstructorFive {

    private int studentId;

    // Constructor with int parameter
    public ConstructorFive(int id) {
        this.studentId = id;
        System.out.println("Constructor called. Int value set to: " + studentId);
    }

    public static void main(String[] args) {
        // Creating an object using the constructor
        ConstructorFive obj = new ConstructorFive(42);

        // Attempting to call the constructor again on the same object
        // This is not possible in Java
        // IF we try to call constructor again with same object then
        // result is a compilation error

    }
}
