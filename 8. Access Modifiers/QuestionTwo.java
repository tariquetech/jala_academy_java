class Myclass {

    int studentId;
    String studentName;

    void getStudent(){
      System.out.println("This is a Default Method");
    }

    
}

// This is subclass in this case
class QuestionTwo {

/* 
Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package
*/

public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.studentId = 101;
        obj.studentName = "Tarique";
        System.out.println(obj.studentId);
        System.out.println(obj.studentName);
        obj.getStudent();
     
    }


}