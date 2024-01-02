public class ConstructorOne {

    ConstructorOne() {
        System.out.println("Default Constructor");
    }

    ConstructorOne(String msg) {
        System.out.println(msg);
    }

    ConstructorOne(String arg1,String arg2) {
        System.out.println(arg1);
        System.out.println(arg2);
    }

    public static void main(String[] args) {
        ConstructorOne obj = new ConstructorOne();
        ConstructorOne obj1 = new ConstructorOne("hii");
        ConstructorOne obj2 = new ConstructorOne("hii","bye");
       
    }
}
