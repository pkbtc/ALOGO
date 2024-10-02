import java.util.*;
class  Leetcode1331{
    public static void main(String[] args) {
        int[] arr={40,10,20,30};
       
    }
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
           return new int[0];
       }
       int[] sortedArr=arr.clone();
       Arrays.sort(sortedArr);
       HashMap<Integer,Integer> map=new HashMap<>();
       int currentRank=1;
       for (int i = 0; i < sortedArr.length; i++) {
           if(!map.containsKey(sortedArr[i])){
               map.put(sortedArr[i],currentRank);
               currentRank++;
           }

       }
       for (int i = 0; i < sortedArr.length; i++) {
           arr[i]=map.get(arr[i]);
       }
       return arr;
   }
}