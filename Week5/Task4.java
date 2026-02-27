package Week5;
import java.util.Scanner;

class Task4 {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax=nums[0];
        int globMin=nums[0];
        int currMax=0;
        int currMin=0;
        int total=0;

        for (int n:nums){
            currMax=Math.max(currMax+n,n);
            currMin=Math.min(currMin+n,n);
            total=total+n;
            globMax=Math.max(globMax,currMax);
            globMin=Math.min(globMin,currMin);
        }
        if (globMax<=0){
            return globMax;
        }
        else{
            return Math.max(globMax,total-globMin);
        }
        
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    Task4 task = new Task4();
    int result = task.maxSubarraySumCircular(arr);
    System.out.println(result);

    sc.close();
    }
}
