package com.rishi.dsa.two_pointers.validpalindrome;

public class Main {
    private static void runTest(String input, boolean expected, boolean actual) {
        System.out.printf("Input: \"%s\"\n", input);
        System.out.printf("Expected: %b, Actual: %b\n", expected, actual);
        System.out.println(expected == actual ? "Result: PASS" : "Result: FAIL");
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Valid Palindrome (LeetCode 125) ---");

        Solution solution = new Solution();

        // Test Case 1: Standard Valid Palindrome with non-alphanumeric characters
        String s1 = "A man, a plan, a canal: Panama";
        boolean expected1 = true;
        boolean result1 = solution.isPalindrome(s1);
        runTest(s1, expected1, result1);

        // Test Case 2: Standard Invalid Palindrome
        String s2 = "race a car";
        boolean expected2 = false;
        boolean result2 = solution.isPalindrome(s2);
        runTest(s2, expected2, result2);

        // Test Case 3: Empty string (Valid Palindrome according to problem description)
        String s3 = " ";
        boolean expected3 = true;
        boolean result3 = solution.isPalindrome(s3);
        runTest(s3, expected3, result3);

        // Test Case 4: String with only spaces and punctuation
        String s4 = ".,:";
        boolean expected4 = true;
        boolean result4 = solution.isPalindrome(s4);
        runTest(s4, expected4, result4);

        // Test Case 5: Palindrome with mixed case
        String s5 = "Madam";
        boolean expected5 = true;
        boolean result5 = solution.isPalindrome(s5);
        runTest(s5, expected5, result5);

        // Test Case 6: Palindrome with numbers
        String s6 = "0P";
        boolean expected6 = false; // "0" and "p" are not the same
        boolean result6 = solution.isPalindrome(s6);
        runTest(s6, expected6, result6);

        // Test Case 7: Another valid complex case
        String s7 = "Was it a car or a cat I saw?";
        boolean expected7 = true;
        boolean result7 = solution.isPalindrome(s7);
        runTest(s7, expected7, result7);

        System.out.println("\n--- Valid Palindrome Tests Complete ---");
    }
}