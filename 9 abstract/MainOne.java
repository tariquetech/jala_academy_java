// Q2 , Q3 , Q4
abstract class AbsClass {
	

    void nonAbstract(){
	 System.out.println("This is non abstract method");
	}

	abstract void absMethod();

}

class MainOne extends AbsClass{
 
   void absMethod(){
   	System.out.println("this is abstract method");
   } 

   public static void main(String[] args){
   	SubClass obj = new SubClass();
   	obj.nonAbstract();
   	obj.absMethod();
   }

}
