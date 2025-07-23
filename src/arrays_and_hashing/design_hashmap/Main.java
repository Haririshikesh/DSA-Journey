// File: LeetCodeSolutions/src/arrays_and_hashing/design_hashmap/Main.java
package src.arrays_and_hashing.design_hashmap;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MyHashMap (implemented as MyHashMap) ---");

        // Create an instance of your MyHashMap class
        MyHashMap hashMap = new MyHashMap(); // Instantiates MyHashMap

        // Test Case 1: Put and Get
        System.out.println("\nTest Case 1: Put and Get");
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        System.out.println("Get(1): " + hashMap.get(1)); // Expected: 10
        System.out.println("Get(2): " + hashMap.get(2)); // Expected: 20
        System.out.println("Get(3): " + hashMap.get(3)); // Expected: -1 (or appropriate default for not found)

        // Test Case 2: Update value
        System.out.println("\nTest Case 2: Update Value");
        hashMap.put(2, 25); // Update value for key 2
        System.out.println("Get(2) after update: " + hashMap.get(2)); // Expected: 25

        // Test Case 3: Remove and Get
        System.out.println("\nTest Case 3: Remove and Get");
        hashMap.remove(1);
        System.out.println("Get(1) after removal: " + hashMap.get(1)); // Expected: -1
        System.out.println("Get(2) after removal of 1: " + hashMap.get(2)); // Expected: 25

        // Test Case 4: Edge cases
        System.out.println("\nTest Case 4: Edge Cases");
        MyHashMap emptyHashMap = new MyHashMap(); // Instantiates another MyHashMap object
        System.out.println("Empty hash map get(5): " + emptyHashMap.get(5)); // Expected: -1
        emptyHashMap.remove(10); // Remove from empty map
        System.out.println("Empty hash map get(10) after removal: " + emptyHashMap.get(10)); // Expected: -1

        System.out.println("\n--- MyHashMap (MyHashMap) Tests Complete ---");
    }
}
