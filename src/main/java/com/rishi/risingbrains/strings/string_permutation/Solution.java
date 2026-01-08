package com.rishi.risingbrains.strings.string_permutation;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return generatePerms("", s1, s2);
    }
    private boolean generatePerms(String current, String remaining, String s2) {
        if (remaining.isEmpty()) {
            return s2.contains(current);
        }
        for(int i=0; i<remaining.length(); i++) {
            String newCurrent = current + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
            if (generatePerms(newCurrent, newRemaining, s2)) {
                return true;
            }
        }
        return false;
    }
}
