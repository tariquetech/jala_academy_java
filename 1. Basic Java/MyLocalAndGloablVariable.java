class MyLocalAndGloablVariable {


static int price = 400;
public static void main(String[] args){

   int price = 500;

   System.out.println(price);  // Print 500

   printPrice();   // Print 400 

}

public static void printPrice(){

  System.out.println(price);

}


}

// price is a local variable declared within the main method.
// price is a class-level (Global Variable) variable declared within the class.
