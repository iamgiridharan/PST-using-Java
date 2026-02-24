package Week3;
import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n= names.length;
        Integer[] idx= new Integer[n];
        for (int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx, (a,b) -> heights[b]-heights[a]);
        String[] result= new String[n];
        for (int i=0;i<n;i++){
            result[i]=names[idx[i]];
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] names=new String[n];
        int[] heights=new int[n];
        for (int i=0;i<n;i++){
            names[i]=sc.next();
            heights[i]=sc.nextInt();
        }
        Solution solution=new Solution();
        String[] sortedNames=solution.sortPeople(names, heights);
        for (String name : sortedNames) {
            System.out.print(name + " ");
        }
        sc.close();
    }
}
