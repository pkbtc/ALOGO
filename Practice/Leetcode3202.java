public class Leetcode3202 {
    public static void main(String[] args) {
        System.out.println(maximumLength(new int[]{1,2,3,4,5},2));
    }
    public static int maximumLength(int[] nums, int k) {
            int n=nums.length;
            int[][] dp=new int[n][k];
            int maxLen=1;
            for(int i=0;i<n;i++){
                for(int rem=0;rem<k;rem++){
                    dp[i][rem]=1;
                }
                for(int j=0;j<i;j++){
                    int rem=(nums[i]+nums[j])%k;
                    dp[i][rem]=Math.max(dp[i][rem],dp[j][rem]+1);
                    maxLen=Math.max(maxLen,dp[i][rem]);
                }
            }
            return maxLen;
    }
    
}
