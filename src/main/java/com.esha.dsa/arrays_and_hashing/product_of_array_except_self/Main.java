package com.esha.dsa.arrays_and_hashing.product_of_array_except_self;

// MainProductExceptSelf.java
// This file contains the main method to test your Product of Array Except Self solution.

public class Main {

    public static void main(String[] args) {
        System.out.println("--- LeetCode Problem: Product of Array Except Self ---");

        // FIX: Create an instance of the Solution class
        Solution solution = new Solution();

        // Example 1 for Product of Array Except Self
        int[] nums1 = {1, 2, 3, 4};
        // Call the method on the 'solution' instance
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.print("Product for [1, 2, 3, 4]: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + (i == result1.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println();

        // Example 2 for Product of Array Except Self
        int[] nums2 = {-1, 1, 0, -3, 3};
        // Call the method on the 'solution' instance
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.print("Product for [-1, 1, 0, -3, 3]: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + (i == result2.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println();

        // Example 3 for Product of Array Except Self (single element)
        int[] nums3 = {5};
        // Call the method on the 'solution' instance
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.print("Product for [5]: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + (i == result3.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println();
    }
}