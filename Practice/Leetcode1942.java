import java.util.*;

public class Leetcode1942 {
    public static void main(String[] args) {
        int[][] times={{3,10},{1,5},{2,6}};
        int ans=smallestChair(times,0);
        System.out.println(ans);
    }
    public static int smallestChair(int[][] times, int targetFriend) {
        int targetArival=times[targetFriend][0];
        Arrays.sort(times,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<int[]> occupied=new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int a[],int b[] ){
                return a[0]-b[0];
            }
        });
        PriorityQueue<Integer> available=new PriorityQueue<>();
        int chairNo=0;
        for(int time[] : times){
            int arrTime=time[0];
            int leavingTime=time[1];
            while(!occupied.isEmpty() && occupied.peek()[0] <=arrTime){
                available.offer(occupied.poll()[1]);

            }
            int currentChairNo;
            if(available.isEmpty()){
                currentChairNo=chairNo;
                chairNo++;
            }
            else {
                currentChairNo=available.poll();
            }
            if(targetArival==arrTime){
                return currentChairNo;
            }
            occupied.offer(new int[]{leavingTime,currentChairNo});
        }
        return -1;
    }
}