
import java.util.*;

public class DistinctSet {
    public static void main(String[] args) {
        int[] arr={2,1,4,1,6,5,5,5};
        int ans=findMinNumberDistinct(arr);
        System.out.println(ans);
    }
    public static int findMinNumberDistinct(int[] arr) {
        
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            max=Math.max(max,map.get(arr[i]));
        }

        
        return max;
    }

}
