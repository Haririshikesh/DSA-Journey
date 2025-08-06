package com.esha.dsa.arrays_and_hashing.remove_element;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int len1 = sol.removeElement(nums1, val1);
        System.out.println("New length for [3, 2, 2, 3] with val 3: " + len1);
        for (int k = 0; k < len1; k++) {
            System.out.print(nums1[k] + " ");
        }
        System.out.println("\n--------------------");

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int len2 = sol.removeElement(nums2, val2);
        System.out.println("New length for [0, 1, 2, 2, 3, 0, 4, 2] with val 2: " + len2);
        for (int k = 0; k < len2; k++) {
            System.out.print(nums2[k] + " ");
        }
        System.out.println("\n--------------------");

        int[] nums3 = {1};
        int val3 = 1;
        int len3 = sol.removeElement(nums3, val3);
        System.out.println("New length for [1] with val 1: " + len3);
        for (int k = 0; k < len3; k++) {
            System.out.print(nums3[k] + " ");
        }
        System.out.println("\n--------------------");

        int[] nums4 = {4, 5};
        int val4 = 4;
        int len4 = sol.removeElement(nums4, val4);
        System.out.println("New length for [4, 5] with val 4: " + len4);
        for (int k = 0; k < len4; k++) {
            System.out.print(nums4[k] + " ");
        }
        System.out.println("\n--------------------");
    }
}