package Week5;

import java.util.Scanner;

class Task1 {
    public int maxSubArray(int[] nums) {
        int curr_sum=nums[0];
        int max_sum=nums[0];
        for (int i=1;i<nums.length;i++){
            curr_sum=Math.max(nums[i],curr_sum+nums[i]);
            max_sum=Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }  
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Task1 obj=new Task1();
        System.out.println(obj.maxSubArray(nums));
        sc.close();
    }
}
