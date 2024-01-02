public class QuestionOne {

/* 
Create a class with PRIVATE fields, private method and a main method. 
Print the fields in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from
sub class 
*/

    private int studentId;
    private int studentName;

    private void getStudent(){
      System.out.println("This is a private method")
    }

    public static void main(String[] args) {
        QuestionOne obj = new QuestionOne();
        obj.studentId;
        obj.studentName;
        obj.getStudent();
        // Attempting to call the constructor again on the same object
        // This is not possible in Java
        // IF we try to call constructor again with same object then
        // result is a compilation error

    }
}
