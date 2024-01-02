class StaticProblemOne{
	



     // Static variables
    private static int staticVar1;
    private static String staticVar2;

    
    // Instance variables
    private int instanceVar1;
    private String instanceVar2;

    // Static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1" + staticVar2);
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }


  public static void main(String[] args){

        // static variables and methods directly in the main method
        staticVar1 = 10;
        staticVar2 = "Hello, Static!";
        staticMethod1();
        staticMethod2();
        
        // instance variables and methods, you need to create an instance of the class
        StaticProblemOne instance = new StaticProblemOne();      
        instance.instanceVar1 = 20;
        instance.instanceVar2 = "Hello, Instance!";
        instance.instanceMethod1();
        instance.instanceMethod2();

  }







}