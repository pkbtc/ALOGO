public class Leetcode2044 {
    public static void main(String[] args) {
        int nums[]={3,1};
        int ans=countMaxOrSubsets(nums);
        System.out.println(ans);
    }
    public static int countMaxOrSubsets(int[] nums) {
        int targetOr=0;
        for(int num:nums){
            targetOr|=num;

        }
        return recurr(0, nums, 0, targetOr);
    }
    public static int recurr(int index,int[] nums,int curOr,int targetOr){
        if(index==nums.length){
            return (curOr==targetOr)?1:0;

            
        }
        int pick=recurr(index+1, nums, curOr| nums[index], targetOr);
        int notPick=recurr(index+1, nums, curOr, targetOr);
        return pick+notPick;
    }
}
