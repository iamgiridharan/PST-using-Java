import java.util.*;

class Task7{
    public static int diagonalDifference(List<List<Integer>> arr){
        int n=arr.size();
        int primarySum=0;
        int secondarySum=0;

        for (int i=0;i<n;i++){
            primarySum+=arr.get(i).get(i);
            secondarySum+=arr.get(i).get(n-1-i);

        }
        return Math.abs(primarySum-secondarySum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
        }

        int result = diagonalDifference(arr);
        System.out.println(result);
        sc.close();
    }
}
