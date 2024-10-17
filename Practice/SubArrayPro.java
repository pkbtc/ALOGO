import java.util.*;

public class SubArrayPro {
    public static void main(String[] args) {
        int[] arr={2,8,2,6,-6,3,2};
       // boolean ans=checkSumArray(arr,5);
       // System.out.println(ans);
        // ArrayList<Integer> list=subArraySum(arr,5);
        // if(list.get(0)==-1){
        //     System.out.println("not found");
        //     return;
        // }
        // System.out.println(list.get(0)+" "+list.get(1));
        // int[] A={10, 5, 2, 7, 1, 9};
        // int ans=lenOfLongSubarr(A,15);
        // System.out.println(ans);
        int[] nums={1,1,1};
        int ans=subarraySum(nums,2);
        System.out.println(ans);
    }
    public static boolean checkSumArray(int[] arr,int k){
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int rem=sum-k;
            if(set.contains(rem)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static ArrayList<Integer> subArraySum(int[] arr,int k){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int rem=sum-k;
            if(map.containsKey(rem)){
                list.set(0,map.get(rem)+1);
                list.add(i);
                break;
            }
            map.put(sum,i);

        }
        return list;
    }
    public static int lenOfLongSubarr(int A[], int K) {
       int maxLength=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       int sum=0;
       for (int i = 0; i < A.length; i++) {
            sum+=A[i];
            int rem=sum-K;
            if(map.containsKey(rem)){
                maxLength=Math.max(maxLength,i-map.get(rem));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

       }
       return maxLength;
    }
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int rem=sum-k;
            
                count+=map.getOrDefault(rem,0);
                map.put(sum,map.getOrDefault(sum, 0)+1);

            

        }
        return count;

    }
}
