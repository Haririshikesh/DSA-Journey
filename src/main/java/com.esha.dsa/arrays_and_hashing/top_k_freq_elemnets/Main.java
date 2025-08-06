package com.esha.dsa.arrays_and_hashing.top_k_freq_elemnets;

import java.util.Arrays; // Needed for Arrays.toString()
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Assuming your Solution class is in the same file or package
// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> mp = new HashMap<>();
//         for (int num : nums) {
//             mp.put(num, mp.getOrDefault(num, 0) + 1);
//         }
//         ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
//         for (int key : mp.keySet()) {
//             if (buckets[mp.get(key)] == null)
//                 buckets[mp.get(key)] = new ArrayList<>();
//             buckets[mp.get(key)].add(key);
//         }
//         int ind = 0;
//         int[] ans = new int[k];
//         for (int i = nums.length; i >= 0 && ind != k; i--) {
//             if (buckets[i] != null) {
//                 for (int num : buckets[i]) {
//                     if (ind == k) { // Stop if k elements are found
//                         break;
//                     }
//                     ans[ind++] = num;
//                 }
//             }
//         }
//         return ans;
//     }
// }

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] result1 = sol.topKFrequent(nums1, k1);
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + Arrays.toString(result1)); // Expected: [1, 2] or [2, 1]

        System.out.println("\n--------------------\n");

        // Test Case 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = sol.topKFrequent(nums2, k2);
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + Arrays.toString(result2)); // Expected: [1]

        System.out.println("\n--------------------\n");

        // Test Case 3
        int[] nums3 = {4, 1, -1, 2, -1, 2, 3};
        int k3 = 2;
        int[] result3 = sol.topKFrequent(nums3, k3);
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Output: " + Arrays.toString(result3)); // Expected: [-1, 2] or [2, -1] (both have frequency 2)

        System.out.println("\n--------------------\n");

        // Test Case 4 (k larger than unique elements)
        int[] nums4 = {7, 7, 8, 8, 8, 9};
        int k4 = 3;
        int[] result4 = sol.topKFrequent(nums4, k4);
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4) + ", k = " + k4);
        System.out.println("Output: " + Arrays.toString(result4)); // Expected: [8, 7, 9] (order might vary for same frequency)
    }
}