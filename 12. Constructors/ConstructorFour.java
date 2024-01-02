public class ConstructorFour {

    /* In Java, constructors do not have a return type. Constructors are 
    special methods used to initialize objects and do not return any 
    values, not even void. The purpose of constructors is to set up the 
    initial state of an object. */

    private int id;
    private String name;

    // default Constructor
    ConstructorFour() {
        System.out.println("Default Constructor");
    }

    // Constructor with int parameter
    public ConstructorFour(int studentId) {
        this.id = studentId;
    }

    // Constructor with String parameter
    public ConstructorFour(String studentName) {
        this.name = studentName;
    }

    // Getter
    public int getStudentId(){
        return id;
    }

    // Getter
    public String getStudentName(){
      return name;
    }


    public static void main(String[] args) {
        ConstructorFour obj = new ConstructorFour();
        ConstructorFour obj1 = new ConstructorFour(101);
        System.out.println("Student ID is : "+obj1.getStudentId());
        ConstructorFour obj2 = new ConstructorFour("Tarique");
        System.out.println("Student Name is : "+obj2.getStudentName());

        
    }
}
