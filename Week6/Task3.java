package Week6;

import java.util.Scanner;

public class Task3 {
    public static String twoStrings(String s1,String s2){
        boolean[] letters = new boolean[26];
        for (char c:s1.toCharArray()){
            letters[c-'a']=true;
        }
        for(char c:s2.toCharArray()){
            if(letters[c-'a']==true){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(twoStrings(s1, s2));
        }
        sc.close();
    }
}
