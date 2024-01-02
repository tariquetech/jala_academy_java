// interface 2

interface MyInterface {
    int add(int a,int b);
    int subtract(int a,int b);
}

class MyClass implements MyInterface {
    // Implementing only method1 from the interface
    @Override
    public int add(int a, int b) {
        int c = a+b;
        return c;
    }
}


public class QuestionTwo {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        // Calling the implemented method
        int sum = myObject.add(5,5);
        System.out.println("Implementation result is " +sum);
    }
}
