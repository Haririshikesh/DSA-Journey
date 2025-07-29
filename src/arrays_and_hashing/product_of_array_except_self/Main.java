package src.arrays_and_hashing.product_of_array_except_self;

// MainProductExceptSelf.java
// This file contains the main method to test your Product of Array Except Self solution.
// You will implement the actual logic in Solution.java.

public class Main {

    public static void main(String[] args) {
        System.out.println("--- LeetCode Problem: Product of Array Except Self ---");

        // Example 1 for Product of Array Except Self
        int[] nums1 = {1, 2, 3, 4};
        // Expected output: [24, 12, 8, 6]
        int[] result1 = Solution.productExceptSelf(nums1);
        System.out.print("Product for [1, 2, 3, 4]: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + (i == result1.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println();

        // Example 2 for Product of Array Except Self
        int[] nums2 = {-1, 1, 0, -3, 3};
        // Expected output: [0, 0, 9, 0, 0]
        int[] result2 = Solution.productExceptSelf(nums2);
        System.out.print("Product for [-1, 1, 0, -3, 3]: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + (i == result2.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println();

        // Example 3 for Product of Array Except Self (single element)
        int[] nums3 = {5};
        // Expected output: [1]
        int[] result3 = Solution.productExceptSelf(nums3);
        System.out.print("Product for [5]: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + (i == result3.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println();
    }
}
