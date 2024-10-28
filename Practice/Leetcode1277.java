public class Leetcode1277 {
    public static void main(String[] args) {
        
    }
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] maximalSquare=new int[m+1][n+1];
        int squareSubMatrix=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i-1][j-1]==1){
                    maximalSquare[i][j]=1+Math.min(Math.min(maximalSquare[i - 1][j], maximalSquare[i][j - 1]), maximalSquare[i - 1][j - 1]);
                    squareSubMatrix+=maximalSquare[i][j];
                }
            }
        }
        return squareSubMatrix;
    }
}
