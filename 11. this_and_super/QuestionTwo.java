// Q2) this and super 

class Parent {
    String name;
    double salary;

    Parent(String studentName, double studentSalary){
        this.name = studentName;
        this.salary = studentSalary;
    }

     void getStudent(){
      System.out.println("Student Name :" + name);
      System.out.println("Student Name :" + salary);
    }




}


public class QuestionTwo extends Parent{
   
   String gender;
    
   QuestionTwo(String studentName, double studentSalary, String gender){
      super(studentName,studentSalary);  
      this.gender = gender;
   }

   void ChildMethod(){
     System.out.println("Student gender is " + gender);
   }
   

   

    public static void main(String[] args) {

          QuestionTwo obj = new QuestionTwo("Tarique",20000.00,"Male");
          obj.getStudent();
          obj.ChildMethod();    

    }
}
