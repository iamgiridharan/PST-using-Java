class Task9 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;

        int[][] prefix=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                
                prefix[i][j]=mat[i][j];
                
                if (i>0){
                    prefix[i][j]+=prefix[i-1][j];
                }
                if (j>0){
                    prefix[i][j]+=prefix[i][j-1];
                }
                if(i>0 && j>0){
                    prefix[i][j]-=prefix[i-1][j-1];
                }

            }
        }
        int[][] ans=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){

                int r1=Math.max(0,i-k);
                int c1=Math.max(0,j-k);
                int r2=Math.min(m-1,i+k);
                int c2=Math.min(n-1,j+k);

                int sum=prefix[r2][c2];

                if (r1>0){
                    sum-=prefix[r1-1][c2];
                }
                if (c1>0){
                    sum-=prefix[r2][c1-1];
                }
                if (r1>0 && c1>0){
                    sum+=prefix[r1-1][c1-1];
                }
                ans[i][j]=sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Task9 task9 = new Task9();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        int[][] result = task9.matrixBlockSum(mat, k);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}