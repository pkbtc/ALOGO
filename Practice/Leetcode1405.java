import java.util.*;
public class Leetcode1405 {
    public static void main(String[] args) {
        String ans=longestDiverseString(1,1,7);
        System.out.println(ans);
    }
    public static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->{
            return y[1]-x[1];
        });
        if(a>0){
            pq.offer(new int[]{'a',a});
        }
        if(b>0){
            pq.offer(new int[]{'b',b});
        }
        if(c>0){
            pq.offer(new int[]{'c',c});
        }
        StringBuilder result=new StringBuilder();
        while(!pq.isEmpty()){
            int[] top=pq.poll();
            char ch=(char)top[0];
            int count=top[1];
            if(result.length()>=2 && result.charAt(result.length()-1)==ch && result.charAt(result.length()-2)==ch){
                if(pq.isEmpty()){
                    break;
                }
                int[] next=pq.poll();
                result.append((char)next[0]);
                next[1]--;
                if(next[1]>0){
                    pq.offer(next);
                }
                pq.offer(new int[]{ch,count});

            }else{
                result.append(ch);
                count--;
                if(count>0){
                    pq.offer(new int[]{top[0],count});
                }
            }
        }
        return result.toString();

    }
}
