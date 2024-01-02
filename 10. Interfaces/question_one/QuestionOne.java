// interface 1

interface MyInterface {
    int add(int a,int b);
}

class MyClass implements MyInterface {
    // Implementing the method from the interface
    @Override
    public int add(int a, int b) {
        int c = a+b;
        return c;
    }
}


public class QuestionOne {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Calling the implemented method
        int sum = myObject.add(5,5);
        System.out.println("Implementation result is " +sum);
    }
}
