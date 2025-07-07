import java.util.*;
public class Leetcode1353 {
    public static void main(String[] args) {
        System.out.println(maxEvents(new int[][]{{1,2},{2,3},{3,4}}));
    }
    public static int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=events.length;
        int i=0;
        int day=0;
        int res=0;
        int lastday=0;

        for(int [] event:events){
            lastday=Math.max(lastday,event[1]);
        }

        for(day=1;day<=lastday;day++){
            while(i<n && events[i][0]==day){
                pq.offer(events[i][1]);
                i++;
            }
            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
            if(!pq.isEmpty()){
                pq.poll();
                res++;
            }
        }
        return res;
    }
}
