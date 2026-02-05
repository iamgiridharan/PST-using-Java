import java.util.*;
public class Task4 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for (int n: nums){
            if (seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        Task4 task4=new Task4();
        boolean result=task4.containsDuplicate(nums);
        System.out.println(result);
        sc.close();
    }
}
