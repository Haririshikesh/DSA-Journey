package src.arrays_and_hashing.top_k_freq_elemnets;

import java.util.Arrays; // Needed for Arrays.toString()
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Assuming your Solution class is in the same file or package
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key : mp.keySet()) {
            if (buckets[mp.get(key)] == null)
                buckets[mp.get(key)] = new ArrayList<>();
            buckets[mp.get(key)].add(key);
        }
        int ind = 0;
        int[] ans = new int[k];
        for (int i = nums.length; i >= 0 && ind != k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    if (ind == k) { // Stop if k elements are found
                        break;
                    }
                    ans[ind++] = num;
                }
            }
        }
        return ans;
    }
}