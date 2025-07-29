package src.arrays_and_hashing.sort_an_array;

public class Main {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        System.out.println("Original array 1: ");
        printArray(nums1);

        Solution sol1 = new Solution();
        sol1.sortColors(nums1);

        System.out.println("Sorted array 1: ");
        printArray(nums1);
        System.out.println("--------------------");

        // Test case 2
        int[] nums2 = {2, 0, 1};
        System.out.println("Original array 2: ");
        printArray(nums2);

        Solution sol2 = new Solution();
        sol2.sortColors(nums2);

        System.out.println("Sorted array 2: ");
        printArray(nums2);
        System.out.println("--------------------");

        // Test case 3 (Already sorted)
        int[] nums3 = {0, 0, 1, 1, 2, 2};
        System.out.println("Original array 3: ");
        printArray(nums3);

        Solution sol3 = new Solution();
        sol3.sortColors(nums3);

        System.out.println("Sorted array 3: ");
        printArray(nums3);
        System.out.println("--------------------");

        // Test case 4 (Empty array)
        int[] nums4 = {};
        System.out.println("Original array 4 (empty): ");
        printArray(nums4);

        Solution sol4 = new Solution();
        sol4.sortColors(nums4);

        System.out.println("Sorted array 4 (empty): ");
        printArray(nums4);
        System.out.println("--------------------");

        // Test case 5 (Single element array)
        int[] nums5 = {1};
        System.out.println("Original array 5 (single element): ");
        printArray(nums5);

        Solution sol5 = new Solution();
        sol5.sortColors(nums5);

        System.out.println("Sorted array 5 (single element): ");
        printArray(nums5);
        System.out.println("--------------------");
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}