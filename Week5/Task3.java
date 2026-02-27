package Week5;
import java.util.*;

public class Task3 {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int currSum = arr.get(0);
        int maxSubarraySum = arr.get(0);
        int maxSubsequenceSum = 0;
        int maxElement = arr.get(0);
        boolean hasPositive = false;

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);

            if (i > 0) {
                currSum = Math.max(value, currSum + value);
                maxSubarraySum = Math.max(maxSubarraySum, currSum);
            }

            if (value > 0) {
                maxSubsequenceSum += value;
                hasPositive = true;
            }

            maxElement = Math.max(maxElement, value);
        }

        if (!hasPositive) {
            maxSubsequenceSum = maxElement;
        }

        return Arrays.asList(maxSubarraySum, maxSubsequenceSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
        sc.close();
    }
}