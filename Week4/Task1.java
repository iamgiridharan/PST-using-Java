import java.util.Scanner;

class Task1 {
    public boolean halvesAreAlike(String s) {
        String vowels="aeiouAEIOU";
        int mid=s.length()/2;
        int countA=0;
        int countB=0;
        for (int i=0;i<mid;i++){
            if (vowels.indexOf(s.charAt(i))!=-1){
                countA++;
            }
        }
        for (int i=mid; i<s.length();i++){
            if (vowels.indexOf(s.charAt(i))!=-1){
                countB++;
            }
        }
        return countA==countB;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();

        Task1 sol=new Task1();
        boolean result=sol.halvesAreAlike(input);
        System.out.println("Alike? ->"+result);
        sc.close();
    }
}    