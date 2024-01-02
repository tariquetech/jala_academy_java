import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListOperations {

    public static void main(String[] args) {
         
        ArrayList<String> names = new ArrayList<>(); 

        // Add an element to the ArrayList
        names.add("tarique");
        names.add("kashif");
        names.add("haroon");
        names.add("rashid");
        names.add("fauzan");
        names.add("rahul");
        names.add("jack");
        names.add("hamid");
        names.add("zaheer");
        names.add("aarif");


        // Iterate through the ArrayList by using Iterator object
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove an element at a specific index
        names.remove(0);



        // Update the element at a specific index
        names.set(1,"Mohammad");

        
         // Check if an element is present at a particular index
        int indexToCheck = 8;
        boolean isElementPresent = indexToCheck >= 0 && indexToCheck < names.size();
        System.out.println("Is element present at index " + indexToCheck + " ? " + isElementPresent);



        // Get an element at a particular index
        String nameZeroIndex = names.get(0);
        System.out.println("Element at zero'th position is " + nameZeroIndex);

        int sizeOfNamesArrayList =  names.size();
        System.out.println(sizeOfNamesArrayList);

        // Check the given element is present in the ArrayList
        String myName = "Mohammad";
        if(names.contains(myName)){
           System.out.println("Element is Present");
        }else {
           System.out.println("Element is Not Present");
        }


        // iterate using for each
        for (String str : names) {
            System.out.println(str);
        }

        
    }
}