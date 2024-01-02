// interface 6


interface MyInterface {
    default void Msg(){
    	System.out.println("Good Morning!");
    }
}


public class QuestionSix implements MyInterface {
    public static void main(String[] args) {
        QuestionSix obj = new QuestionSix();
        obj.Msg();
    }
}
