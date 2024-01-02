import java.util.Scanner;

class ArraysProlem {
	
	public static void main(String[] args){
       
       // 1 Write a function to add integer values of an array
       // int no[] = {5,5,5,10};
       // int sumOfNo = addInteger(no);
       // System.out.println(sumOfNo);

       // Write a function to calculate the average value of an array of integers
       int no[] = {5,5,5,10};
       int avgOfNo = avgInteger(no);
       System.out.println(avgOfNo);

	}
  
  // Write a function to calculate the average value of an array of integers
  // static int addInteger(int[] numbers){
    
  //    int sum = 0;
  //    for (int i=0; i<= numbers.length-1; i++) {
  //       sum = sum + numbers[i];
  //    }
  //     return sum;
 
  // }

  // Write a function to calculate the average value of an array of integers

  static int avgInteger(int[] numbers){  
     int avg = 1;
     for (int i=0; i<= numbers.length-1; i++) {
        avg = avg + numbers[i];
     }
      return avg / numbers.length;
 
  }



}