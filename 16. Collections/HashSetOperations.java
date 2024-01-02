import java.util.HashSet;
import java.util.Set;
public class HashSetOperations {

    public static void main(String[] args) {
         
        HashSet<String> names = new HashSet<String>();

        // Add operation
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

        System.out.println(names);

        // Check If an Item Exists
        System.out.println("Is Item is Exist ? "+names.contains("tarique"));

        // Remove an Item
        names.remove("jack");
        System.out.println("After removing 'jack' from HashSet "+names);

        // Find the size of HashSet
        System.out.println("The size of HashSet is: " + names.size());

        // iterate hashset using for each
        int count = 0;
        for (String name : names) {
           count++;
           System.out.println(count +" "+ name);
        }

        // remove all elements from HashSet

        names.clear();
        System.out.println("After removing all elements from HashSet "+names);










    }
}