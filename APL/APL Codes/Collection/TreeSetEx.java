import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Mango");

        System.out.println("Initial TreeSet: " + treeSet);

        // Check if an element exists
        System.out.println("Contains 'Apple'? " + treeSet.contains("Apple"));

        // Remove an element
        treeSet.remove("Orange");
        System.out.println("After removing 'Orange': " + treeSet);

        // First and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Size of TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Iterating through TreeSet
        System.out.println("Iterating through TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

    }
}
