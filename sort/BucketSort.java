import java.util.*;
public class BucketSort{

    public static void main(String[] args) {
        float arr[] ={0.78f,0.17f,0.39f,0.26f,0.72f,0.94f,0.21f,0.12f,0.23f,0.68f};
        ArrayList<Float> res=bucketSort(arr);
        System.out.println(res);
    }
    public static ArrayList<Float> bucketSort(float[] arr){
        if(arr.length==0){
            return null;
        }
        float maxElement=find(arr);
        int maxIndex=(int)(maxElement*arr.length);
        int bucketSize=maxIndex+1;
        ArrayList<Float>[] buckets=new ArrayList[bucketSize];
        for(int i=0;i<bucketSize;i++){
            buckets[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            int index=(int)(arr[i]*bucketSize);
            int targetIndex=0;
            while(targetIndex<buckets[index].size() && arr[i]>=buckets[index].get(targetIndex)){
                targetIndex++;
            }
            buckets[index].add(targetIndex,arr[i]);
        }
        // for(int i=0;i<bucketSize;i++){
        //     Collections.sort(buckets[i]);
        // }
        
        ArrayList<Float> res=new ArrayList<>();
        for(int i=0;i<bucketSize;i++){
            System.out.println(buckets[i]);
            for(Float element:buckets[i]){
                res.add(element);
            }
        }
        return res;
        
    }
    public static float find(float[] arr){
        float max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}