package com.esha.dsa.arrays_and_hashing.subarray_sum_equals_k;

import com.esha.dsa.arrays_and_hashing.subarray_sum_equals_k.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        com.esha.dsa.arrays_and_hashing.subarray_sum_equals_k.Solution solution = new com.esha.dsa.arrays_and_hashing.subarray_sum_equals_k.Solution();

        // Test Case 1
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        int result1 = solution.subarraySum(nums1, k1);
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + result1); // Expected output: 2
        System.out.println("--------------------");

        // Test Case 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        int result2 = solution.subarraySum(nums2, k2);
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + result2); // Expected output: 2
        System.out.println("--------------------");

        // Test Case 3 (with negative numbers)
        int[] nums3 = {1, -1, 1, 1, 1, -1};
        int k3 = 3;
        int result3 = solution.subarraySum(nums3, k3);
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Output: " + result3); // Expected output: 3
        System.out.println("--------------------");
    }
}