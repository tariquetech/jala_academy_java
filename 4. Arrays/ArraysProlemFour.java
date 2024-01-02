import java.util.Scanner;
class ArraysProlemFour {
	
	public static void main(String[] args){
       
      

       // 4. Write a function to test if array contains a specific value
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number"); 
      int findNo = s.nextInt();

       int no[] = {5,6,7,8,9,10};
       boolean find = checkValue(no,findNo);
       System.out.println(find);


	}
  
  static boolean checkValue(int[] numbers, int findNo){
    

     for (int i=0; i <= numbers.length-1; i++) {
       if(numbers[i]==findNo){
         return true;
       }
     }
     return false;
 
  }



}