package GFG;
import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        
    }
    public int countPairs(int arr[], int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
            else {
                map.put(arr[i],1);
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                continue;
            }
            int secVal=target-arr[i];
            if(map.getOrDefault(secVal,0)>0){
                count+=map.get(secVal);
                map.put(arr[i],map.get(arr[i])-1);
                if(arr[i]==secVal){
                    count--;
                }

            }

        }
        return count;
    }
}
