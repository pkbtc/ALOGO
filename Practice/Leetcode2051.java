import java.util.*;

public class Leetcode2051 {
    public static void main(String[] args) {
        int[] nums={4,3,6,16,8,2};
        int ans=longestSquareStreak(nums);
        System.out.println(ans);
    }
    public static int longestSquareStreak(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int max=-1;
            Arrays.sort(nums);
            for(int i : nums){
                int root=(int)Math.sqrt(i);
                if(root*root==i && map.containsKey(root)){
                    map.put(i, map.get(root) + 1);
                    max=Math.max(max, map.get(i));
                }
                else{
                    map.put(i, 1);
                    
                }

            }
            return max;
    }
}
