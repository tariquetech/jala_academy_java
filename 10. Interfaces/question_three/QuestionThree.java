// interface 3


interface MyInterface {
    int add(int a,int b);
}

class MyClass implements MyInterface {
    // Implementing only method1 from the interface
    @Override
    public int add(int a, int b) {
        int c = a+b;
        return c;
    }
}

public class QuestionThree {
    public static void main(String[] args) {
        // Creating an object of MyClass using the interface reference
        MyInterface interfaceRef = new MyClass();

        // Calling the implemented method using the interface reference
        int sum = interfaceRef.add(5,5);
        System.out.println("Implementation result is " +sum);
    }
}
