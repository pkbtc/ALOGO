import java.util.*;
public class Leetcode169 {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int ans=new Leetcode169().majorityElement(nums);
        System.out.println(ans);
    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

}
