import java.util.*;
class Task8 {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] transposed=new int[cols][rows];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){

                transposed[j][i]=matrix[i][j];
            }
        }
        return transposed;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        Task8 obj = new Task8();
        int[][] result = obj.transpose(matrix);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}