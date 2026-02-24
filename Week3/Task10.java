package Week3;

import java.util.*;

public class Task10 {
    public int AddSub(int N, int opt) {

        int result = 0;
        boolean add = true;

        for(int i = N; i >= 1; i--) {

            if(opt == 1) {
                if(add)
                    result += i;
                else
                    result -= i;
            }
            else {  // opt == 2
                if(i == N || add)
                    result += i;
                else
                    result -= i;
            }

            add = !add;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.print("Enter opt (1 for alternating, 2 for grouping): ");
        int opt = sc.nextInt();

        Task10 task10 = new Task10();
        int result = task10.AddSub(N, opt);

        System.out.println("Result: " + result);

        sc.close();
    }
}