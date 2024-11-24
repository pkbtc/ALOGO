public class Leetcode1975 {
    public static void main(String[] args) {
        int[][] matrix={{1,-1},{-1,1}};
        System.out.println(new Leetcode1975().maxMatrixSum(matrix));
    }
    public long maxMatrixSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        long sum=0;
        int min=Integer.MAX_VALUE;
        int countNeg=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=Math.abs(matrix[i][j]);
                min=Math.min(min,Math.abs(matrix[i][j]));
                if(matrix[i][j]<0){
                    countNeg++;
                }
            }
        }
        if(countNeg%2==0){
            return sum;
        }
        return sum-2*min;
    }
}
