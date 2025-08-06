package com.esha.dsa.arrays_and_hashing.first_missing_positive;


class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] flags = new boolean[nums.length+1];
        for(int num : nums){
            if(num>=1 && num<=nums.length) flags[num]=true;
        }
        for(int i=1; i<flags.length; i++){
            if(!flags[i]) return i;
        }
        return nums.length+1;
    }
}