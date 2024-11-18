import java.util.*;
public class Leetcode3254 {
    public static void main(String[] args) {
        System.out.println(new Leetcode3254().resultsArray(new int[]{1,2,3,4,3,2,5},3));
    }
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] results=new int[n-k+1];
        int[] f=new int[n];
        Arrays.fill(f,-1);

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                f[i]=f[i-1]+1;
            }
        }
        for(int i=k-1;i<n;i++){
            results[i-k+1]=f[i]>=k?nums[i]:-1;
        }
        return results;

    }
}
