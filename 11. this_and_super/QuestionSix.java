class Parent {
    int parentValue;

    Parent(int value) {
        this.parentValue = value;
    }

    // In Regular method, java not allowed to use this() or super()
    void regularMethod() {
        System.out.println("Regular method in Parent class");
    }
}

class Child extends Parent {
    int childValue;

    Child(int parentValue, int childValue) {
        super(parentValue); 
        this.childValue = childValue;
    }
    
    // In Regular method, java not allowed to use this() or super()
    void regularMethod() {
        System.out.println("Regular method in Child class");
    }
}

public class QuestionSix {
    public static void main(String[] args) {

        Child childObject = new Child(10, 20);
        // Accessing values
        System.out.println("Parent Value: " + childObject.parentValue);
        System.out.println("Child Value: " + childObject.childValue);

        // Calling regular methods
        childObject.regularMethod(); // Calls the regular method in Child class
        ((Parent) childObject).regularMethod(); // Calls the regular method in Parent class using type casting
    }
}
