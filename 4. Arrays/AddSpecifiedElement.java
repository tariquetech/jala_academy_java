import java.util.*;
class AddSpecifiedElement{
	

  public static void main(String[] args){

    // Scanner s = new Scanner(System.in);
    // int removeNo = s.nextInt();

    int myArr[] = {1,2,3,4,5};

    int ele = 18;
    int pos = 2;     

    System.out.println("Original Array");
    for (int arrEle : myArr) {
    	System.out.println(arrEle);
    }

    int[] newArray = addArrayElement(myArr,ele,pos);

    System.out.println("New Array");
    for (int arrEle : newArray) {
    	System.out.println(arrEle);
    }


  }


  static int[] addArrayElement(int[] myArr, int ele, int pos){
   
        int count = myArr.length;

        

        int[] newArr = new int[count];
        int index = 0;

        for (int arrEle : myArr) {
        	if(arrEle[pos] == r){
        		newArr[index++] = arrEle;
        	}

        }

        for (int i = 0 ; i<=length ; ) {
          
        }

        return newArr;



  }





}