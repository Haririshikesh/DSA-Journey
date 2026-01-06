package com.rishi.dsa.arrays_and_hashing.productexceptself;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1] * nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            ans[i] = ans[i-1] * nums[i];
        }
        return new int[]{-1,-1};
    }
}