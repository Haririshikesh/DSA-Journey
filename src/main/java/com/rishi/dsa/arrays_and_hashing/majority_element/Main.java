package com.rishi.dsa.arrays_and_hashing.majority_element;

public class Main {
    public static void main(String[] args) {
        // Create an instance of your Solution class
        Solution sol = new Solution();

        // Test Cases

        // Test Case 1: Simple Majority
        int[] nums1 = {3, 2, 3};
        int result1 = sol.majorityElement(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Input: [3, 2, 3]");
        System.out.println("Expected Output: 3"); // 3 appears 2 times, n=3, floor(n/2)=1. 2 > 1.
        System.out.println("Your Output: " + result1);
        System.out.println("--------------------");

        // Test Case 2: Another Majority
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = sol.majorityElement(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Input: [2, 2, 1, 1, 1, 2, 2]");
        System.out.println("Expected Output: 2"); // 2 appears 4 times, n=7, floor(n/2)=3. 4 > 3.
        System.out.println("Your Output: " + result2);
        System.out.println("--------------------");

        // Test Case 3: Single Element Array
        int[] nums3 = {1};
        int result3 = sol.majorityElement(nums3);
        System.out.println("Test Case 3:");
        System.out.println("Input: [1]");
        System.out.println("Expected Output: 1"); // 1 appears 1 time, n=1, floor(n/2)=0. 1 > 0.
        System.out.println("Your Output: " + result3);
        System.out.println("--------------------");

        // Test Case 4: Larger array
        int[] nums4 = {6,5,5};
        int result4 = sol.majorityElement(nums4);
        System.out.println("Test Case 4:");
        System.out.println("Input: [6,5,5]");
        System.out.println("Expected Output: 5");
        System.out.println("Your Output: " + result4);
        System.out.println("--------------------");
    }
}