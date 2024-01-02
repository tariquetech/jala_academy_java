// interface 7

interface MyInterface {
    default void Msg(){
    	System.out.println("Good Morning!");
    }

    int add(int a, int b);
}

interface MyOtherInterface extends MyInterface {
    int subtract(int a, int b);
}

class MyClass implements MyOtherInterface {
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

public class QuestionSeven {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.Msg();

        int sum = obj.add(16,13);
        int sub = obj.subtract(16,13);
        System.out.println("Implementation result of 1st interface is " +sum);
        System.out.println("Implementation result of 2nd interface is " +sub);

    }
}
