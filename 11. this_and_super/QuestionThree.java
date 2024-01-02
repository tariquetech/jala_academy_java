class MyClass {
    // Instance variables
    private int variable1;
    private String variable2;

    // Default constructor
    public MyClass() {
        // Call the parameterized constructor with default values
        this(0, "Default");
    }

    // Parameterized constructor
    public MyClass(int variable1, String variable2) {
        // Initialize instance variables
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    // Method to display instance variables
    public void display() {
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
    }
}

public class QuestionThree {
    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        System.out.println("Object 1:");
        obj1.display();

        // // Create an object using the parameterized constructor
        // MyClass obj2 = new MyClass(42, "Hello");
        // System.out.println("\nObject 2:");
        // obj2.display();
    }
}
