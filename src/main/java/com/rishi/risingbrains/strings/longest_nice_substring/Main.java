package com.rishi.risingbrains.strings.longest_nice_substring;

/**
 * PROBLEM: LEETCODE 1763 - Longest Nice Substring
 * LINK: https://leetcode.com/problems/longest-nice-substring/
 * * * * PROBLEM EXPLANATION:
 * A string 's' is "nice" if, for every letter of the alphabet that 's' contains, 
 * it appears in both uppercase and lowercase. 
 * For example, "abABB" is nice because 'a' and 'A' are present, and 'b' and 'B' are present.
 * "abA" is NOT nice because 'b' is present but 'B' is not.
 * We need to return the longest substring that is nice. If there are multiple, return the one 
 * that appears earliest.
 * * * * APPROACH (Divide and Conquer - Recursive):
 * 1. We scan the string and store all present characters in a Set (or a frequency-style check).
 * 2. We iterate through the string character by character.
 * 3. For each character `c`, we check if its "partner" (the opposite case) exists in the string.
 * - If `c` is 'a', we check if 'A' is there.
 * - If `c` is 'A', we check if 'a' is there.
 * 4. If we find a character that DOES NOT have its partner, this character CANNOT be part 
 * of any nice substring.
 * 5. This character acts as a "splitter." We split the string at this index into a 'left' 
 * part and a 'right' part.
 * 6. We recursively call the function on both parts and return the longest string among the two.
 * 7. Base Case: If the entire string is scanned and every character has a partner, the string 
 * itself is "nice."
 * * * * WHY NOT SLIDING WINDOW?
 * A standard sliding window usually works when the condition is "monotonic" (adding a char 
 * makes it more likely to meet the condition). Here, adding a character can make a string 
 * "not nice," but adding another one later could make it "nice" again. This makes sliding 
 * window complex (though possible with a fixed-unique-character approach). Divide and Conquer 
 * is much more intuitive for this specific constraint.
 * * * * TIME COMPLEXITY: O(N^2)
 * - In the worst case (e.g., "aAbBcCdD..."), we might split the string many times.
 * - Each recursive level scans the string (O(N)), and the depth of recursion can be O(N).
 * * * * SPACE COMPLEXITY: O(N)
 * - Due to the recursion stack and the creation of substrings in each recursive call.
 */

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Standard case
        String s1 = "YazaAay";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: \"" + solution.longestNiceSubstring(s1) + "\""); 
        // Expected: "aAa" (Note: "azaAay" is not nice because 'z' and 'y' lack partners)
        System.out.println("-----------------------------------------");

        // Example 2: Multiple nice substrings
        String s2 = "Bb";
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: \"" + solution.longestNiceSubstring(s2) + "\""); 
        // Expected: "Bb"
        System.out.println("-----------------------------------------");

        // Example 3: No nice substring
        String s3 = "c";
        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: \"" + solution.longestNiceSubstring(s3) + "\""); 
        // Expected: ""
        System.out.println("-----------------------------------------");

        // Example 4: Complex case
        String s4 = "dDzeE";
        System.out.println("Input: \"" + s4 + "\"");
        System.out.println("Output: \"" + solution.longestNiceSubstring(s4) + "\""); 
        // Expected: "dD" (earliest longest)
    }
}

/*
class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        
        java.util.Set<Character> set = new java.util.HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the character's counterpart is missing, it's a split point
            if (set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))) {
                continue;
            }
            
            // Divide and Conquer
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));
            
            return left.length() >= right.length() ? left : right;
        }
        
        return s; // If we reach here, the whole string is nice
    }
}
*/