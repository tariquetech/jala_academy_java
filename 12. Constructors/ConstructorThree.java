public class ConstructorThree {

    // Public constructor
    public ConstructorThree() {
        System.out.println("Public constructor");
    }

    // Private constructor
    private ConstructorThree(int privateParam) {
        System.out.println("Private constructor with parameter: " + privateParam);
    }

    // Protected constructor
    protected ConstructorThree(String protectedParam) {
        System.out.println("Protected constructor with parameter: " + protectedParam);
    }

    // Default constructor
    ConstructorThree(double defaultParam) {
        System.out.println("Default constructor with parameter: " + defaultParam);
    }

    public static void main(String[] args) {
        ConstructorThree publicObj = new ConstructorThree();
        
        // Private constructor cannot be accessed directly from outside the class
        // Uncommenting the line below will result in a compilation error
        // MyClass privateObj = new MyClass(10);

        // Protected constructor can be accessed from a subclass
        SubClass subObj = new SubClass("Protected Constructor");

        // Default constructor can be accessed within the same package
        ConstructorThree defaultObj = new ConstructorThree(3.14);
    }
}


class SubClass extends ConstructorThree {

    // Subclass constructor calling the protected constructor of the superclass
    public SubClass(String param) {
        super(param);
    }
}