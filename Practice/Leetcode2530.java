import java.util.*;
public class Leetcode2530 {
    public static void main(String[] args) {
        int[] nums={10,10,10,10,10};
        int k=5;
        long ans=maxKelements(nums,k);
        System.out.println(ans);
    }
    public static  long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
        long score=0;
        while(k>0){
            int val=pq.poll();
            score+=val;
            pq.offer(Math.ceilDiv(val, 3));
            k--;
        }
        return score;
    }
}
