package Week2;
import java.util.*;

class Task1 {
    public static int secondHighest(int[] arr){
        return Arrays.stream(arr).distinct().boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(-1);
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(secondHighest(arr));
    sc.close();
}
}
