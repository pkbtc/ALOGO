import java.util.*;
public class Leetcode3011 {
    public static void main(String[] args) {
        int[] nums={8,4,2,30,15};
        System.out.println(new Leetcode3011().canSortArray(nums));
    }
    public boolean canSortArray(int[] nums) {
        int prevMax=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            int bits=Integer.bitCount(nums[i]);
            int j=i+1;
            int min=nums[i];
            int max=nums[i];

            while(j<n && bits==Integer.bitCount(nums[j])){
                min=Math.min(min, nums[j]);
                max=Math.max(max, nums[j]);
                j++;
            }
            if(prevMax>min){
                return false;
            }
            prevMax=max;
            i=j;
        }
        return true;

    }
    
}
