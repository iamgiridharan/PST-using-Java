package Week2;

import java.util.*;

public class Task10 {

    public static int sumOfSumsOfDigits(int input1) {

        String s = String.valueOf(input1);
        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int tempSum = 0;

            for (int j = i; j < s.length(); j++) {
                tempSum += s.charAt(j) - '0';
            }

            total += tempSum;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int result = sumOfSumsOfDigits(number);

        System.out.println("Sum of Sums of Digits: " + result);

        sc.close();
    }
}