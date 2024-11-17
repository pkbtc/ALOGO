import java.util.Deque;
import java.util.*;
public class Leetcode862 {
    public static void main(String[] args) {
        System.out.println(new Leetcode862().shortestSubarray(new int[]{1},1));
    }
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long[] prefixSum=new long[n+1];

        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }

        Deque<Integer> indexDeque=new ArrayDeque<>();
        int minLength=Integer.MAX_VALUE;

        for(int i=0;i<=n;i++){
            while(!indexDeque.isEmpty() && prefixSum[i]-prefixSum[indexDeque.peekFirst()]>=k){
                minLength=Math.min(minLength,i-indexDeque.pollFirst());
            }

            while(!indexDeque.isEmpty() && prefixSum[indexDeque.peekLast()]>=prefixSum[i]){
                indexDeque.pollLast();
            }
            indexDeque.offerLast(i);
        }
        return minLength ==Integer.MAX_VALUE ? -1 : minLength;
    }   
}
