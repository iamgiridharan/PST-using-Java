package Week2;
import java.util.*;
public class Task8 {
    public static long noOfStars(int input1, int input2, int input3){
        long N = input1;
        long H = input2;
        long I = input3;

        long part1 = H * N * (N + 1) / 2;
        long part2 = I * N * (N + 1) * (N - 1) / 3;

        return part1 + part2;
    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        long result = noOfStars(input1, input2, input3);
        System.out.println(result);
        sc.close();
    }
}
