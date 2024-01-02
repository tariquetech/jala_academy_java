class Parent {
 
   public Parent(){
     System.out.println("Parent Class Constructor Called");
   }

}

class MyClass extends Parent {

    // Default constructor
    public MyClass() {
      super();  
      System.out.println("Child Class Constructor Called");
    }


}

public class QuestionFive {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
    }
}
