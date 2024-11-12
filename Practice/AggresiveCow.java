import java.util.*;
public class AggresiveCow {
    public static void main(String[] args) {
        int ans=aggressiveCows(new int[]{1,2,4,8,9}, 3);
        System.out.println(ans);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        if(stalls.length<k){
            return -1;
        }
        Arrays.sort(stalls);
        int start=1;
        int end=stalls[stalls.length-1]-stalls[0];
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(stalls,mid,k)){
                res=mid;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        } 
        return res;
    }
    public static boolean isPossible(int[] stalls,int dis,int cows){
        int cowCount=1;
        int lastCowDistance=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastCowDistance>=dis){
                cowCount++;
                lastCowDistance=stalls[i];
            }
            if(cowCount==cows){
                return true;
            }
        }
        return false;
    }
}
