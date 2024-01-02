import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapOperations {

    public static void main(String[] args) {
         

        Map<Integer,String> names = new HashMap<>();

        // Insert a Key value mapping into the map
        names.put(1,"tarique");
        names.put(2,"kashif");
        names.put(3,"haroon");
        names.put(4,"rashid");
        names.put(5,"fauzan");
        names.put(6,"rahul");
        names.put(7,"jack");
        names.put(8,"hamid");
        names.put(9,"zaheer");
        names.put(10,"aarif");



     // Fetch the value of a Key
     System.out.println(names.get(5));

     // Create a clone/copy of HashMap

     // Map<Integer,String> namesClone = HashMap<>(names);

     Map<Integer, String> clonedMap = new HashMap<>(names);


     
     // Check if the given Key is in the Map
     if(names.containsKey(5)){
        System.out.println("Key is available");
     }else{
        System.out.println("Key is not available");
     }    


     // Check if the value is in the Map      
     if(names.containsValue("tarique")){
        System.out.println("Value is available");
     }else{
        System.out.println("Value is not available");
     }


     
     // Check if the map is empty

     boolean isEmty = names.isEmpty();
     System.out.println("Is the map empty ? "+isEmty);



     // Print the size of the Map to the console

     System.out.println(names.size());


     // Print all the Keys of the map to the console
     Set<Integer> keys = names.keySet();
     System.out.println(keys);


     // Remove a specific Key-value pair
     System.out.println(names.remove(7));



     // Copy all the elements of the Map to another Map
      
     Map<Integer,String> newNames = new HashMap<>();
     
     newNames.putAll(names);

     System.out.println("newNames after copying" + newNames);

        
    }
}