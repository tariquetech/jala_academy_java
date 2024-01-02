class ExceptionTwo {
	
	public static void main(String[] args){

       try{
       	 int a = 20;
   	     int b = 0;
   	     int c = a / b;
         System.out.println("Division Result is " +c);
       }catch(ArithmeticException e){
         System.out.println("Arithmetic Exception : try to divide by zero " +e);
       }

	}
}


// Output : ArithmeticException: / by zero