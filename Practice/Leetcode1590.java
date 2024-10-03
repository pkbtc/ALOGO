
import java.util.*;
public class Leetcode1590{
    public static void main(String[] args) {
        int[] arr={3,1,4,2};
        int p=6;
    }
    public int minSubarray(int[] nums, int p) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int n=nums.length;
            int sum=0;
            int target=0;
            for(int num:nums){
                target=(target+num)%p;
            }
            if(target==0){
                return 0;
            }
            map.put(0,-1);
            int ans=n;
            for (int i = 0; i < n; i++) {
                sum = (sum + nums[i]) % p;
                int key = (sum - target + p) % p;

                if (map.containsKey(key)) {
                    ans = Math.min(ans, i - map.get(key));
                }

                map.put(sum % p, i);
            }
            return ans < n ? ans : -1;
    }
}