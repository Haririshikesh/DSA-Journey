package com.rishi.risingbrains.strings.string_permutation;

/**
 * PROBLEM: LEETCODE 567 - Permutation in String
 * LINK: https://leetcode.com/problems/permutation-in-string/
 * * PROBLEM EXPLANATION:
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 * * APPROACH (Sliding Window + Frequency Array):
 * 1. A permutation of s1 means any string that contains the exact same characters as s1 with 
 * the exact same frequencies.
 * 2. Instead of generating all permutations (which is O(N!) and very slow), we use a sliding 
 * window of size s1.length() over s2.
 * 3. We maintain a frequency count of characters in s1 and a running frequency count for the 
 * current window in s2.
 * 4. If at any point the window's frequency array matches s1's frequency array, we found a permutation.
 * * WHY NOT BRUTE FORCE?
 * Generating all permutations of s1 takes O(N!) time. If s1.length is 10, that's 3.6 million permutations.
 * If it's 20, it's impossible to compute. Checking frequency is much more efficient at O(N).
 * * TIME COMPLEXITY: O(L1 + 26 * (L2 - L1)) -> O(L2)
 * - We iterate over s1 once to build the initial map (O(L1)).
 * - We slide the window across s2 (O(L2 - L1) steps).
 * - At each step, we compare two arrays of size 26 (constant time).
 * * SPACE COMPLEXITY: O(1)
 * - We use two integer arrays of size 26 to store character frequencies.
 * - Since the size of the alphabet is fixed (26 for lowercase English), the space is constant.
 */

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Standard case - true
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println("Input: s1 = \"ab\", s2 = \"eidbaooo\"");
        System.out.println("Output: " + solution.checkInclusion(s1, s2)); // Expected: true
        System.out.println("-----------------------------------------");

        // Example 2: Negative case - false
        String s3 = "ab";
        String s4 = "eidboaoo";
        System.out.println("Input: s1 = \"ab\", s2 = \"eidboaoo\"");
        System.out.println("Output: " + solution.checkInclusion(s3, s4)); // Expected: false
        System.out.println("-----------------------------------------");

        // Example 3: Same string - true
        System.out.println("Input: s1 = \"hello\", s2 = \"ooollehh\"");
        System.out.println("Output: " + solution.checkInclusion("hello", "ooollehh")); // Expected: true
    }
}

/*
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if (n > m) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Step 1: Initialize the frequencies for the first window
        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Step 2: Slide the window across s2
        for (int i = 0; i < m - n; i++) {
            if (isMatch(s1Count, s2Count)) return true;
            
            // Move window: Remove left char and add right char
            s2Count[s2.charAt(i) - 'a']--; // Remove old
            s2Count[s2.charAt(i + n) - 'a']++; // Add new
        }

        // Final check for the last window
        return isMatch(s1Count, s2Count);
    }

    private boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
*/