// Q1) this and super 

public class QuestionOne{
    
    String name;
    double salary;
    
    QuestionOne(String studentName, double studentSalary){
        this.name = studentName;
        this.salary = studentSalary;
    }

    void getStudent(){
      System.out.println("Student Name :" + this.name);
      System.out.println("Student Name :" + this.salary);
    }
   

    public static void main(String[] args) {

          QuestionOne obj = new QuestionOne("Tarique",20000.00);
          obj.getStudent();    

    }
}
