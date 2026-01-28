package Week3;

import java.util.*;

public class Task2 {
    public static String splitnum(int n, String word){
        ArrayList<String> wordList=new ArrayList<>();
        for (int i=0;i<= word.length()-n; i++){
            String s=word.substring(i,i+n);
            wordList.add(s);
        }
        Collections.sort(wordList);
        System.out.println(wordList);
        return "the smallest is  "+ wordList.get(0)+ "  and the greatest is" + wordList.get(wordList.size()-1);
    }   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int n=sc.nextInt();

        String result=splitnum(n, word);
        System.out.println(result);
        sc.close();
    }
}
