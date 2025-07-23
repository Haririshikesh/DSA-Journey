// File: LeetCodeSolutions/src/sort_an_array/Main.java
package src.arrays_and_hashing.sort_an_array;

import java.util.Arrays; // Needed for Arrays.toString()

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Sort an Array ---");

        // Create an instance of the Solution class
        Solution sol = new Solution();

        // Test Case 1: Basic array
        int[] nums1 = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        System.out.println("\nTest Case 1 (nums: " + Arrays.toString(nums1) + "):");
        int[] result1 = sol.sortArray(nums1);
        System.out.println("Sorted: " + Arrays.toString(result1)); // Expected: [1, 2, 3, 5]
        System.out.println("\n--- Sort an Array Tests Complete ---");
    }
}
