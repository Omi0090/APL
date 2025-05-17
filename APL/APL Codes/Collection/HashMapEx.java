import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "John");
        hashMap.put(102, "Alice");
        hashMap.put(103, "Bob");
        hashMap.put(104, "Emily");

        System.out.println("Initial HashMap: " + hashMap);

        // Get value by key
        System.out.println("Value for key 102: " + hashMap.get(102));

        // Check if a key exists
        System.out.println("Contains key 105? " + hashMap.containsKey(105));

        // Check if a value exists
        System.out.println("Contains value 'Bob'? " + hashMap.containsValue("Bob"));

        // Remove an entry
        hashMap.remove(103);
        System.out.println("After removing key 103: " + hashMap);

        // Size of HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Iterating through HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Replace a value
        hashMap.replace(101, "Jonathan");
        System.out.println("After replacing value for key 101: " + hashMap);

    }
}
