package com.dailyprog.productexceptself;

import java.util.Arrays;

public class Main {
    /**
     * Helper method to print the test case and result.
     * @param input The input array.
     * @param result The output array from the solution.
     */
    private static void runTest(int[] input, int[] result) {
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Output Array: " + Arrays.toString(result));
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Product of Array Except Self (LeetCode 238) ---");

        // The Solution class would contain the 'productExceptSelf' method.
        // We assume it's implemented and available here.
        // For this example, let's call it 'Solution'.
        Solution solution = new Solution(); // Instantiates the Solution class

        // Test Case 1: Standard case
        System.out.println("\nTest Case 1: Standard Array");
        int[] nums1 = {1, 2, 3, 4};
        // Expected: [24, 12, 8, 6]
        int[] result1 = solution.productExceptSelf(nums1);
        runTest(nums1, result1);

        // Test Case 2: Array with zero
        System.out.println("\nTest Case 2: Array with One Zero");
        int[] nums2 = {5, 0, 2, 4};
        // Expected: [0, 40, 0, 0]
        int[] result2 = solution.productExceptSelf(nums2);
        runTest(nums2, result2);

        // Test Case 3: Array with multiple zeros
        System.out.println("\nTest Case 3: Array with Two Zeros");
        int[] nums3 = {0, 0, 3, 5};
        // Expected: [0, 0, 0, 0]
        int[] result3 = solution.productExceptSelf(nums3);
        runTest(nums3, result3);

        // Test Case 4: Negative numbers
        System.out.println("\nTest Case 4: Array with Negative Numbers");
        int[] nums4 = {-1, 2, -3, 4};
        // Expected: [-24, 12, -8, 6]
        int[] result4 = solution.productExceptSelf(nums4);
        runTest(nums4, result4);

        // Test Case 5: Minimum size array
        System.out.println("\nTest Case 5: Smallest Valid Array (Size 2)");
        int[] nums5 = {7, 8};
        // Expected: [8, 7]
        int[] result5 = solution.productExceptSelf(nums5);
        runTest(nums5, result5);

        System.out.println("\n--- Product of Array Except Self Tests Complete ---");
    }
}