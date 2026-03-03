package Week6;

import java.util.*;


class Task5 {

    public static int marsExploration(String s) {
        int count=0;
        String letters="SOS";
        int res=0;
        for(char ch: s.toCharArray()){
            if (count==3){
                count=0;
            }
            if (ch!=letters.charAt(count)){
                res++;
            }
            count++;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = marsExploration(s);
        System.out.println(result);
        sc.close();
    }
}
