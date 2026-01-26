package Week2;
import java.util.*;
interface Operation {
            boolean check(int a);
    }
class Task2 {
    
    public static Operation isOdd(){
        return (int a) -> a%2!=0;
    }
    public static Operation isPrime(){
         return (int a)->{
            if (a<=1) return false;
            if (a==2) return true;
            if (a%2==0) return false;
            
            for (int i=3;i*i<=a;i+=2){
                if (a%i==0) return false;
            }
            return true;  
         };
    }
    public static Operation isPalindrome(){
        return (int a)->{
            int orig_num=a;
            int rev_num=0;

            while(a>0){
                int digit=a%10;
                rev_num=rev_num*10+digit;
                a=a/10;
            }
            return orig_num==rev_num;
        };
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0){
            int condition=sc.nextInt();
            int number=sc.nextInt();

            if (condition==1){
                Operation op=isOdd();
                System.out.println(op.check(number)? "Odd":"Even");
            }
            else if (condition==2){
                Operation op=isPrime();
                System.out.println(op.check(number)? "Prime":"Composite");
            }
            else if (condition==3){
                Operation op=isPalindrome();
                System.out.println(op.check(number)? "It is Palindrome": "It is not a Palindrome");
            }
            
        }
        sc.close();
    }
    

    
}
