package com.esha.dsa.arrays_and_hashing.subarray_sum_equals_k;



class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                // Check if the current subarray sum equals k
                if (currentSum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}