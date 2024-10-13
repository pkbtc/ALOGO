import java.util.*;
public class Leetcode632 {
    public static void main(String[] args) {
        List<List<Integer>> nums=new ArrayList<>();
        
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int k=nums.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            int minVal=nums.get(i).get(0);
            pq.offer(new int[]{minVal,i,0});
            max=Math.max(max,minVal);
        }
        int[] minRange={0,Integer.MAX_VALUE};
        while(true){
            int top[] = pq.poll();
            int minElement=top[0],listIndex=top[1],elementIndex=top[2];
            if(max-minElement<minRange[1]-minRange[0]){
                minRange[0]=minElement;
                minRange[1]=max;
            }
            if(elementIndex==nums.get(listIndex).size()-1){
                break;
            }
            pq.offer(new int[]{nums.get(listIndex).get(elementIndex+1),listIndex,elementIndex+1});
            max=Math.max(max,nums.get(listIndex).get(elementIndex+1));
        }
        return minRange;
        
    }
}
