import java.util.*;
public class Leetcode2563 {
    public static void main(String[] args) {
        long ans=new Leetcode2563().countFairPairs(new int[]{0,1,7,4,4,5},3,6);
        System.out.println(ans);
    }
        public long countFairPairs(int[] nums, int lower, int upper) {
            Arrays.sort(nums);
            return countLess(nums,upper)-countLess(nums,lower-1);
        }
        private long countLess(int[] nums,int val){
            long count=0;
            int j=nums.length-1;
            for(int i=0;i<nums.length;i++){
                while(i<j && nums[i]+nums[j]>val){
                    j--;
                }
                count+=Math.max(0,j-i);
            }
            return count;
        }
}