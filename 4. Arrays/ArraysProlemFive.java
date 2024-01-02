import java.util.*;
class ArraysProlemFive {
	
	public static void main(String[] args){
       
      

       // 5. Write a function to remove a specific element from an array
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number"); 

        int[] numbers = {1, 2, 3, 4, 5};
        int elementToRemove = s.nextInt();

        int[] resultArray = removeElement(numbers, elementToRemove);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(resultArray));


	}
  
   static int[] removeElement(int[] arr, int element) {
        // Count occurrences of the element to determine the new array size
        int count = 0;
        for (int num : arr) {
            if (num != element) {
                count++;
            }
        }

        // Create a new array with the updated size
        int[] resultArray = new int[count];
        int index = 0;

        // Copy elements to the new array, excluding the specified element
        for (int num : arr) {
            if (num != element) {
                resultArray[index++] = num;
            }
        }

        return resultArray;
    }



}