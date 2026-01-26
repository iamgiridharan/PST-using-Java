package Week2;
import java.util.*;

class Task3{
    public static void minmax(long[] arr){
        long total=0;
        long min=Long.MAX_VALUE;
        long max= Long.MIN_VALUE;
        for (long x: arr){
            total+=x;

            if (x<min) min=x;
            if (x>max) max=x;
        }   
        long minSum=total-max;
        long maxSum=total-min;
        System.out.println(minSum);
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] arr= new long[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextLong();
        }
        minmax(arr);
        sc.close();
    }
}    