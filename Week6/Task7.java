package Week6;

import java.util.*;

public class Task7 {
    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int palindromeIndex(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s, i + 1, j)) {
                    return i;
                } 
                else if (isPalindrome(s, i, j - 1)) {
                    return j;
                } 
                else {
                    return -1;
                }
            }
            i++;
            j--;
        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();   // number of test cases
        sc.nextLine();          // consume newline

        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            int result =palindromeIndex(s);
            System.out.println(result);
        }

        sc.close();
    }

}

