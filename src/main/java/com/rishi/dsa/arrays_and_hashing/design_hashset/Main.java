// File: LeetCodeMyHashSets/src/arrays_and_hashing/design_hashset/Main.java
package com.rishi.dsa.arrays_and_hashing.design_hashset;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MyHashSet (implemented as MyHashSet) ---");

        // Create an instance of your MyHashSet class, which implements MyHashSet functionality
        MyHashSet hashSet = new MyHashSet(); // Correctly instantiates the MyHashSet class

        // Test Case 1: Add elements and check containment
        System.out.println("\nTest Case 1: Add and Contains");
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("Contains 1: " + hashSet.contains(1)); // Expected: true
        System.out.println("Contains 3: " + hashSet.contains(3)); // Expected: false
        hashSet.add(2); // Adding duplicate
        System.out.println("Contains 2: " + hashSet.contains(2)); // Expected: true

        // Test Case 2: Remove elements and check containment
        System.out.println("\nTest Case 2: Remove and Contains");
        hashSet.remove(2);
        System.out.println("Contains 2 after removal: " + hashSet.contains(2)); // Expected: false
        System.out.println("Contains 1 after removal of 2: " + hashSet.contains(1)); // Expected: true
        hashSet.remove(3); // Removing non-existent element
        System.out.println("Contains 3 after removal: " + hashSet.contains(3)); // Expected: false (still false)

        // Test Case 3: Edge cases
        System.out.println("\nTest Case 3: Edge Cases");
        MyHashSet emptyHashSet = new MyHashSet(); // Correctly instantiates another MyHashSet object
        System.out.println("Empty hash set contains 5: " + emptyHashSet.contains(5)); // Expected: false
        emptyHashSet.remove(10); // Remove from empty set
        System.out.println("Empty hash set contains 10 after removal: " + emptyHashSet.contains(10)); // Expected: false

        System.out.println("\n--- MyHashSet (MyHashSet) Tests Complete ---");
    }
}
