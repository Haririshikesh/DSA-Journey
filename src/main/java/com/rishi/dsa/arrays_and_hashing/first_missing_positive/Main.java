package com.rishi.dsa.arrays_and_hashing.first_missing_positive;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1:
        int[] nums1 = {1, 2, 0};
        Solution solution = new Solution();
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums1)); // Expected output: 3
        System.out.println("--------------------");

        // Example 2:
        int[] nums2 = {3, 4, -1, 1};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums2)); // Expected output: 2
        System.out.println("--------------------");

        // Example 3:
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums3)); // Expected output: 1
        System.out.println("--------------------");

        // Example 4:
        int[] nums4 = {1};
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums4)); // Expected output: 2
        System.out.println("--------------------");

        // Example 5:
        int[] nums5 = {2};
        System.out.println("Input: " + Arrays.toString(nums5));
        System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums5)); // Expected output: 1
        System.out.println("--------------------");
    }
}