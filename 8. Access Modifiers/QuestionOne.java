public class QuestionOne {

/* 
Create a class with PRIVATE fields, private method and a main method. 
Print the fields in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from
sub class 
*/

    private int studentId;
    private String studentName;

    private void getStudent(){
      System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.studentId = 101;
        obj.studentName = "Tarique";
        System.out.println(obj.studentId);
        System.out.println(obj.studentName);
        obj.getStudent();
        

    }
}


class SubClass extends QuestionOne {

// Subclass can inherit fields and methods, but private ones are not
// directly accessible


}