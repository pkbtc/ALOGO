package GFG;
import java.util.*;
public class ArraySubset {
    public static void main(String[] args) {
            long[] a1={11, 7, 1, 13, 21, 3, 7, 3};
            long[] a2={11, 3, 7, 1, 7};
            String ans=isSubset(a1,a2,8,5);
            System.out.println(ans);
            }
    public static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> map=new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            if(map.containsKey(a1[i])){
                int val=map.get(a1[i]);
                val++;
                map.put(a1[i],val);
            }
            else{
                map.put(a1[i],1);
            }
        }
        for (int i = 0; i < a2.length; i++) {
            if(map.containsKey(a2[i]) && map.get(a2[i])>0){
                int val=map.get(a2[i]);
                val--;
                map.put(a2[i],val);
                
        }
        else{
            return "No";
        }
        }
        return "Yes";
        
    }
}
