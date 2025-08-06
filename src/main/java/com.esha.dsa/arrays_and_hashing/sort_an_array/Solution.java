package com.esha.dsa.arrays_and_hashing.sort_an_array;

public class Solution {
    public int[] sortArray(int[] nums) {
        dualPivotQuickSort(nums, 0, nums.length-1);
        // singlePivotQuickSort(nums, 0, nums.length-1);
        return nums;
    }
    public void singlePivotQuickSort(int[] nums, int low, int high){
        if(low < high){
            int partition = singlePivotPartition(nums, low, high);
            singlePivotQuickSort(nums, low, partition-1);
            singlePivotQuickSort(nums, partition+1, high);
        }
    }
    public void dualPivotQuickSort(int[] nums, int low, int high){
        if(low < high){
            int[] partition = dualPivotPartition(nums, low, high);
            dualPivotQuickSort(nums, low, partition[0]-1);
            dualPivotQuickSort(nums, partition[0]+1, partition[1]-1);
            dualPivotQuickSort(nums, partition[1]+1, high);
        }
    }
    public int singlePivotPartition(int[] nums, int low, int high){
        int i= low-1, pvt = nums[high];
        for(int j=low; j<high; j++){
            if(nums[j]<=pvt){
                swap(nums, ++i, j);
            }
        }
        swap(nums, i+1, high);
        return i+1;
    }
    public int[] dualPivotPartition(int[] nums, int low, int high){
        if(nums[low] > nums[high]) {
            swap(nums, low, high);
        }
        int pivot1 = nums[low], pivot2 = nums[high];
        int lt = low + 1, gt = high - 1;
        int curr = low + 1;
        while(curr <= gt){
            if(nums[curr] < pivot1){
                swap(nums, lt++, curr++);
            } else if (nums[curr] > pivot2){
                swap(nums, curr, gt--);
            } else {
                curr++;
            }
        }
        swap(nums, low, lt-1);
        swap(nums, high, gt+1);
        return new int[]{ lt-1, gt+1};
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}