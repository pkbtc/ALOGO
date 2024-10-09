import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr={2,1,7,8,2,1,9,10,9,9,2,8,2};
        int ans=mostFrequent(arr);
        System.out.println(ans);
    } 
    public static int mostFrequent(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        int maxFreq=0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
            else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])>maxFreq){
                maxFreq=map.get(arr[i]);
                ans=arr[i];
            }
        }
        return ans;
    }
}