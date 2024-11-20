import java.util.HashMap;

public class Leetcode2461 {
    public static void main(String[] args) {

    }
    public long maximumSubarraySum(int[] nums, int k) {
        long currSum=0;
        long res=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
            currSum+=nums[i];

            if(i>=k){
                int leftElement=nums[i-k];
                currSum-=leftElement;
                map.put(leftElement,map.get(leftElement)-1);

                if(map.get(leftElement)==0){
                    map.remove(leftElement);
                }
            }
            if(map.size()==k){
                res=Math.max(res,currSum);
            }

        }
        
        return res;
    }
}
