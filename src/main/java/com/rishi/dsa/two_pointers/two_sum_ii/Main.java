package com.rishi.dsa.two_pointers.two_sum_ii;

import java.util.Arrays;

public class Main {
    private static void runTest(int[] nums, int target, int[] expected, int[] actual) {
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Expected Indices (1-based): " + Arrays.toString(expected));
        System.out.println("Actual Indices (1-based): " + Arrays.toString(actual));
        System.out.println(Arrays.equals(expected, actual) ? "Result: PASS" : "Result: FAIL");
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Two Sum II (LeetCode 167) ---");

        Solution solution = new Solution();

        // Test Case 1: Standard case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {1, 2};
        int[] result1 = solution.twoSum(nums1, target1);
        runTest(nums1, target1, expected1, result1);

        // Test Case 2: Solution at the ends of the array (CORRECTED)
        int[] nums2 = {5, 25, 75};
        int target2 = 80;
        int[] expected2 = {1, 3}; // CORRECT: 5 + 75 = 80
        int[] result2 = solution.twoSum(nums2, target2);
        runTest(nums2, target2, expected2, result2);

        // Test Case 3: Negative numbers (CORRECTED)
        int[] nums3 = {-5, -3, 0, 1, 4};
        int target3 = -1;
        int[] expected3 = {1, 5}; // CORRECT: -5 + 4 = -1
        int[] result3 = solution.twoSum(nums3, target3);
        runTest(nums3, target3, expected3, result3);

        // Test Case 4: Multiple valid pairs (Setting expectation to the first found by Two-Pointer) (CORRECTED)
        int[] nums4 = {-10, -5, 0, 5, 10};
        int target4 = 0;
        int[] expected4 = {1, 5}; // CORRECT: -10 + 10 = 0 (Found first by standard two-pointer approach)
        int[] result4 = solution.twoSum(nums4, target4);
        runTest(nums4, target4, expected4, result4);

        // Test Case 5: Solution is in the middle
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7};
        int target5 = 10;
        int[] expected5 = {3, 7}; // 3 + 7 = 10
        int[] result5 = solution.twoSum(nums5, target5);
        runTest(nums5, target5, expected5, result5);

        System.out.println("\n--- Two Sum II Tests Complete ---");
    }
}