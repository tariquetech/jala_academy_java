import java.util.*;
class RemoveSpecifiedElement{
	

  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    int removeNo = s.nextInt();

    int myArr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    System.out.println("Original Array");
    for (int arrEle : myArr) {
    	System.out.println(arrEle);
    }

    int[] newArray = removeArrayElement(myArr,removeNo);

    System.out.println("New Array");
    for (int arrEle : newArray) {
    	System.out.println(arrEle);
    }


  }


  static int[] removeArrayElement(int[] myArr, int removeNo){
   
        int count = 0;

        for (int arrEle : myArr) {
        	if(arrEle != removeNo){
        		count++;
        	}
        }

        int[] newArr = new int[count];
        int index = 0;

        for (int arrEle : myArr) {
        	if(arrEle != removeNo){
        		newArr[index++] = arrEle;
        	}
        }

        return newArr;



  }





}