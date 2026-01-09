package com.rishi.risingbrains.strings.string_permutation;

import java.util.Arrays;

//Brute Force Approach
// public class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         return generatePerms("", s1, s2);
//     }
//     private boolean generatePerms(String current, String remaining, String s2) {
//         if (remaining.isEmpty()) {
//             return s2.contains(current);
//         }
//         for(int i=0; i<remaining.length(); i++) {
//             String newCurrent = current + remaining.charAt(i);
//             String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
//             if (generatePerms(newCurrent, newRemaining, s2)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// Sorting Approach
// public class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int len1 = s1.length();
//         int len2 = s2.length();

//         if(len1>len2) return false;

//         char[] s1Array = s1.toCharArray();
//         Arrays.sort(s1Array);
//         String sort1 = new String(s1Array);

//         for(int i=0; i<=len2-len1; i++) {
//             char[] s2Array = s2.substring(i, i+len1).toCharArray();
//             Arrays.sort(s2Array);
//             String sort2 = new String(s2Array);
//             if(sort1.equals(sort2)) return true;
//         }
//         return false;
//     }
// }

// Sliding Window Approach
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s2.length()<s1.length()) return false;

         int[] s1Count = new int[26];
         int[] s2Count = new int[26];

         for(int i=0; i<s1.length(); i++){
            s1Count[s1.charAt(i)-'a']++;
            s2Count[s2.charAt(i)-'a']++;
         }
         for(int i=0; i<s2.length()-s1.length(); i++){
            if(matches(s1Count , s2Count)) return true;

            s2Count[s2.charAt(i)-'a']--;
            s2Count[s2.charAt(i+ s1.length())-'a']++;
         }
         return matches(s1Count, s2Count);
    }
    private boolean matches(int[] s1Counts, int[] s2Counts){
        for(int i=0; i<s1Counts.length; i++){
            if(s1Counts[i]!=s2Counts[i]) return false;
        }
        return true;
    }

}