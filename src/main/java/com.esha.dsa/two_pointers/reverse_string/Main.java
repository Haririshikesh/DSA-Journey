package com.esha.dsa.two_pointers.reverse_string;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println(java.util.Arrays.toString(s1));

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s2);
        System.out.println(java.util.Arrays.toString(s2));

        char[] s3 = {'A'};
        solution.reverseString(s3);
        System.out.println(java.util.Arrays.toString(s3));

        char[] s4 = {};
        solution.reverseString(s4);
        System.out.println(java.util.Arrays.toString(s4));
    }
}