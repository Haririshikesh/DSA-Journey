package com.dailyprog.merge_intervals;

import java.util.Arrays;

public class Main {
    private static String intervalsToString(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < intervals.length; i++) {
            sb.append(Arrays.toString(intervals[i]));
            if (i < intervals.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static void runTest(int[][] input, int[][] expected, int[][] actual) {
        System.out.println("Input Intervals: " + intervalsToString(input));
        System.out.println("Expected Output: " + intervalsToString(expected));
        System.out.println("Actual Output: " + intervalsToString(actual));
        // Note: A simple array equals check is insufficient for 2D arrays,
        // but for display, we assume the solution returns the canonical sorted form.
        System.out.println("---");
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Merge Intervals (LeetCode 56) ---");

        Solution solution = new Solution();

        // Test Case 1: Standard overlapping intervals
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected1 = {{1, 6}, {8, 10}, {15, 18}};
        int[][] result1 = solution.merge(intervals1);
        runTest(intervals1, expected1, result1);

        // Test Case 2: One interval nested inside another
        int[][] intervals2 = {{1, 4}, {2, 3}};
        int[][] expected2 = {{1, 4}};
        int[][] result2 = solution.merge(intervals2);
        runTest(intervals2, expected2, result2);

        // Test Case 3: Intervals touching at the boundary
        int[][] intervals3 = {{1, 4}, {4, 5}};
        int[][] expected3 = {{1, 5}};
        int[][] result3 = solution.merge(intervals3);
        runTest(intervals3, expected3, result3);

        // Test Case 4: No overlap, already sorted
        int[][] intervals4 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expected4 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] result4 = solution.merge(intervals4);
        runTest(intervals4, expected4, result4);

        // Test Case 5: Complex unsorted list merging into one block
        int[][] intervals5 = {{8, 10}, {1, 4}, {2, 6}, {15, 18}, {17, 20}};
        int[][] expected5 = {{1, 6}, {8, 10}, {15, 20}};
        int[][] result5 = solution.merge(intervals5);
        runTest(intervals5, expected5, result5);

        // Test Case 6: Empty input
        int[][] intervals6 = {};
        int[][] expected6 = {};
        int[][] result6 = solution.merge(intervals6);
        runTest(intervals6, expected6, result6);

        System.out.println("\n--- Merge Intervals Tests Complete ---");
    }
}