package com.rishi.dsa.two_pointers.two_sum_ii;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left =0, right = nums.length-1;
        while(left < right){
            int tot = nums[left] + nums[right];
            if(tot == target){
                return new int[]{left+1, right+1};
            }
            else if(tot < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}