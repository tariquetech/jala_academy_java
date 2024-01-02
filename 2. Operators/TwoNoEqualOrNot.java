import java.util.Scanner;

class TwoNoEqualOrNot {
	
	public static void main(String[] args){

       Scanner s = new Scanner(System.in);

       System.out.println("Enter first Number");
       int no1 = s.nextInt();

       System.out.println("Enter second Number");
       int no2 = s.nextInt();

       if(no1 == no2){
         System.out.println("The number are equal");
       }else{
         System.out.println("The number are not equal");
       }


	}

}