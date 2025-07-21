// File: LeetCodeSolutions/src/arrays_and_hashing/two_sum/Main.java
package src.arrays_and_hashing.two_sum; // IMPORTANT: This line declares the package

// No need to import Solution if both Main and Solution are in the same package

public class Main {
    public static void main(String[] args) {
        // Create an instance of your Solution class
        // Since Solution is in the same package, you can refer to it directly
        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("Test Case 1 (nums: [2, 7, 11, 15], target: 9):");
        if (result1 != null) {
            System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [0, 1]
        } else {
            System.out.println("No solution found.");
        }
        System.out.println("--------------------");

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("Test Case 2 (nums: [3, 2, 4], target: 6):");
        if (result2 != null) {
            System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 2]
        } else {
            System.out.println("No solution found.");
        }
        System.out.println("--------------------");

        // Test Case 3: No solution
        int[] nums3 = {1, 2, 3};
        int target3 = 7;
        try {
            int[] result3 = sol.twoSum(nums3, target3);
            System.out.println("Test Case 3 (nums: [1, 2, 3], target: 7):");
            if (result3 != null) {
                System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Test Case 3 (nums: [1, 2, 3], target: 7):");
            System.out.println("Error: " + e.getMessage()); // Expected: No two sum solution
        }
        System.out.println("--------------------");
    }
}