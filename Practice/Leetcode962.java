import java.util.*;

public class Leetcode962 {
    public static void main(String[] args) {
        int[] nums={6,0,8,2,1,5};
        int ans=maxWidthRamp(nums);
        System.out.println(ans);
    }
    public static int maxWidthRamp(int[] nums) {
        Stack<Integer> stack=new Stack<>(); 
        for (int i = 0; i < nums.length; i++) {
            if(stack.isEmpty()|| nums[stack.peek()]>nums[i]){
                stack.push(i);
            }

        }
        int ans=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                ans=Math.max(ans,i-stack.pop());

            }
            if(stack.isEmpty()){
                break;
            }
        }
        return ans;
    }
}
