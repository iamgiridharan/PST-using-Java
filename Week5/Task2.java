package Week5;

import java.util.*;

class Result {

    public static int[] maxSubarray(int[] arr) {
        int maxSubarraySum = arr[0];
        int currSum = arr[0];

        int maxSubsequenceSum = 0;
        int maxElement = arr[0];
        boolean hasPositive = false;

        for (int i = 0; i < arr.length; i++) {

            if (i > 0) {
                currSum = Math.max(arr[i], currSum + arr[i]);
                maxSubarraySum = Math.max(maxSubarraySum, currSum);
            }
            if (arr[i] > 0) {
                maxSubsequenceSum += arr[i];
                hasPositive = true;
            }

            maxElement = Math.max(maxElement, arr[i]);
        }
        if (!hasPositive) {
            maxSubsequenceSum = maxElement;
        }

        return new int[]{maxSubarraySum, maxSubsequenceSum};
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] result = Result.maxSubarray(arr);
            System.out.println(result[0] + " " + result[1]);
        }
        sc.close();
    }
}
