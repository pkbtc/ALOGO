import java.util.Arrays;

public class Leetcode338 {
    public static void main(String[] args) {
        int n=2;
        int[] ans=countBits(n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i]+=ans[i>>1]+(i&1);
        }
        return ans;
    }
}
