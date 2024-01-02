class ArithmaticOperation {


public static void main(String[] args){

   int a = 5;
   int b = 5;



   addition(a,b);          // 10
   subtraction(a,b);       // 0
   multiplication(a,b);    // 25
   divide(a,b);            // 1

}

public static void addition(int a, int b){
  System.out.println(a+b);
}

public static void subtraction(int a, int b){
  System.out.println(a-b);
}

public static void multiplication(int a, int b){
  System.out.println(a*b);
}

public static void divide(int a, int b){
  System.out.println(a/b);
}




}
