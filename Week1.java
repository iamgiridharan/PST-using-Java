import java.util.Arrays;

class Week1 {

    // Task 1: Print all elements of an array
    public static void printArray(int[] arr) {
        System.out.println("Array elements:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Task 2: Access and print the element at a given index in an array
    public static void printElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
        } else {
            System.out.println("Element at index " + index + " = " + arr[index]);
        }
    }

    // Task 3: Search for a given element in a sorted array using Binary Search
    public static int binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    } 

    // Task 4: Find the maximum element in an array of n integers
    public static int maxelement(int[] arr) {
        int max = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Task 5: Find the Kth smallest element in an array
    public static int kthSmallest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            return -1;
        }

        Arrays.sort(arr); 
        return arr[k - 1]; 
    }

    // Task 6: Print all possible pairs of elements from an array of size n
    public static void printAllPairs(int[] arr) {
        System.out.println("All possible pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    // Main method (Testing all tasks)
    public static void main(String[] args) {

        int[] arr = {6, 2, 9, 1, 5, 3};

        // Task 1
        printArray(arr);

        // Task 2
        printElementAtIndex(arr, 3);

        // Task 3 
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        System.out.println("Binary Search Index of " + target + " = " + binarysearch(sortedArr, target));

        // Task 4
        System.out.println("Maximum element = " + maxelement(arr));

        // Task 5
        int k = 3;
        System.out.println(k + "rd smallest element = " + kthSmallest(arr, k));

        // Task 6
        printAllPairs(arr);
    }
}