// interface 4

interface MyInterfaceOne {
    int add(int a,int b);
}

interface MyInterfaceTwo {
    int subtract(int a,int b);
}

class MyClass implements MyInterfaceOne,MyInterfaceTwo {
    // Implementing only method1 from the interface
    @Override
    public int add(int a, int b) {
        int c = a+b;
        return c;
    }

    @Override
    public int subtract(int a, int b) {
        int c = a-b;
        return c;
    }
}

public class QuestionFour {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        int sum = obj.add(15,5);
        int sub = obj.subtract(15,5);
        System.out.println("Implementation result is " +sum);
        System.out.println("Implementation result is " +sub);
    }
}
