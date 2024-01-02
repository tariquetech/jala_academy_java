class ParentClass {

    public ParentClass() {
        System.out.println("Default constructor of ParentClass");
    }

    public ParentClass(String message) {
        System.out.println("Parameterized constructor of ParentClass: " + message);
    }
}


class ChildClass extends ParentClass {
    
     public ChildClass() {
        // Call the default constructor of the superclass using super()
        super();
        System.out.println("Default constructor of ChildClass");
    }

    public ChildClass(String message) {
        // Call the parameterized constructor of the superclass using super()
        super(message);
        System.out.println("Parameterized constructor of ChildClass: " + message);
    }


}


class ConstructorTwo {

 public static void main(String[] args){
       ChildClass obj = new ChildClass();
       ChildClass obj1 = new ChildClass("Hi, how are you ?"); 
 }

}



