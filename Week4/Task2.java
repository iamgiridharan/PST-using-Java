import java.util.Scanner;

class Task2 {

    public static boolean isLapindrome(String s) {
        int n = s.length();
        int mid = n / 2;

        int[] count = new int[26];

        // Count left half
        for (int i = 0; i < mid; i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        // Decide start of right half
        int start = (n % 2 == 0) ? mid : mid + 1;

        // Subtract using right half
        for (int i = start; i < n; i++) {
            char c = s.charAt(i);
            count[c - 'a']--;
        }

        // Check all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lowercase string:");
        String input = sc.nextLine();

        if (isLapindrome(input)) {
            System.out.println("Lapindrome");
        } else {
            System.out.println("Not Lapindrome");
        }

        sc.close();
    }
}
