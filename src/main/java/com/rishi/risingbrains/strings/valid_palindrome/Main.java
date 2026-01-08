package com.rishi.risingbrains.strings.valid_palindrome;

/**
 * PROBLEM: LEETCODE 125 - Valid Palindrome
 * LINK: https://leetcode.com/problems/valid-palindrome/
 * * * PROBLEM EXPLANATION:
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * * * APPROACH (Two Pointers - Optimal):
 * 1. Initialize two pointers: 'left' at the start (0) and 'right' at the end (length - 1).
 * 2. Move the 'left' pointer forward if the current character is not alphanumeric.
 * 3. Move the 'right' pointer backward if the current character is not alphanumeric.
 * 4. Once both pointers point to alphanumeric characters, compare them (case-insensitive).
 * 5. If they don't match, return false. If they do, move both pointers toward the center.
 * 6. Repeat until the pointers meet.
 * * * WHY NOT STRING REVERSAL?
 * While you could create a new filtered string, reverse it, and compare (s.equals(reversed)), 
 * this approach requires O(N) extra space to store the new strings. The Two-Pointer 
 * approach is preferred because it works "in-place" without extra memory allocation.
 * * * TIME COMPLEXITY: O(N)
 * - We traverse the string exactly once from both ends. 
 * - Each character is visited at most once by either the left or right pointer.
 * * * SPACE COMPLEXITY: O(1)
 * - No additional data structures (like StringBuilder or Lists) are used that scale with input size.
 * - We only use a few primitive integer variables for the pointers.
 */

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Standard Palindrome with spaces and punctuation
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: " + solution.isPalindrome(s1)); // Expected: true
        System.out.println("-----------------------------------------");

        // Example 2: Non-palindrome
        String s2 = "race a car";
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: " + solution.isPalindrome(s2)); // Expected: false
        System.out.println("-----------------------------------------");

        // Example 3: Empty string (after filtering, it's considered a palindrome)
        String s3 = " ";
        System.out.println("Input: \" \"");
        System.out.println("Output: " + solution.isPalindrome(s3)); // Expected: true
        System.out.println("-----------------------------------------");

        // Example 4: Numeric Palindrome
        String s4 = "0P";
        System.out.println("Input: \"" + s4 + "\"");
        System.out.println("Output: " + solution.isPalindrome(s4)); // Expected: false
    }
}

/*
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare characters after converting to lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
*/