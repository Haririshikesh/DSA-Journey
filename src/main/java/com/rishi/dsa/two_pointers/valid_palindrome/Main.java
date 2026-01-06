package com.rishi.dsa.two_pointers.valid_palindrome;

public class Main {
    public static void main(String[] args) {
        // You would have your Solution.java file with the isPalindrome method.
        // For example:
        // public class Solution {
        //     public boolean isPalindrome(String s) { ... }
        // }
        Solution solution = new Solution();

        System.out.println("--- Test Case 1: Classic Palindrome ---");
        String s1 = "A man, a plan, a canal: Panama";
        boolean result1 = solution.isPalindrome(s1);
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Is it a valid palindrome? " + result1); // Expected: true
        System.out.println();

        System.out.println("--- Test Case 2: Not a Palindrome ---");
        String s2 = "race a car";
        boolean result2 = solution.isPalindrome(s2);
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Is it a valid palindrome? " + result2); // Expected: false
        System.out.println();

        System.out.println("--- Test Case 3: Empty string after filtering ---");
        String s3 = " ";
        boolean result3 = solution.isPalindrome(s3);
        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Is it a valid palindrome? " + result3); // Expected: true
        System.out.println();

        System.out.println("--- Test Case 4: Mismatch with numbers and letters ---");
        String s4 = "0P";
        boolean result4 = solution.isPalindrome(s4);
        System.out.println("Input: \"" + s4 + "\"");
        System.out.println("Is it a valid palindrome? " + result4); // Expected: false
        System.out.println();

        System.out.println("--- Test Case 5: All non-alphanumeric characters ---");
        String s5 = ".,;!@#$%^&*()";
        boolean result5 = solution.isPalindrome(s5);
        System.out.println("Input: \"" + s5 + "\"");
        System.out.println("Is it a valid palindrome? " + result5); // Expected: true
        System.out.println();

        System.out.println("--- Test Case 6: Palindrome with numbers ---");
        String s6 = "1a2a1";
        boolean result6 = solution.isPalindrome(s6);
        System.out.println("Input: \"" + s6 + "\"");
        System.out.println("Is it a valid palindrome? " + result6); // Expected: true
        System.out.println();
    }
}
