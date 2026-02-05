import java.util.*;
public class Task6 {
    public void moveZeroes(int[] nums) {
        int count=0;
        int[] moved= new int[nums.length];
        for(int i=0; i< nums.length;i++){
            if (nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        while (count<nums.length){
            nums[count]=0;
            count++;
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        Task6 task6=new Task6();
        task6.moveZeroes(nums); 
        for (int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}