public class Leetcode2270 {
    public static void main(String[] args) {
        int arr[]={10,4,-8,7};
        System.out.println(new Leetcode2270().waysToSplitArray(arr));
    }
    public int waysToSplitArray(int[] nums) {
        //bf
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n-1;i++){
        //     int rightSum=0;
        //     int leftSum=0;
        //     for(int j=i+1;j<n;j++){
        //         rightSum+=nums[j];
        //     }
        //     for(int j=0;j<i;j++){
        //         leftSum+=nums[j];
        //     }
        //     if(leftSum>=rightSum){
        //         count++;
        //     }
        // }
        // return count;
        int n=nums.length;
        int count=0;
        long rightSum=0;
        long leftSum=0;
        long  totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        for(int i=0;i<n-1;i++){
            leftSum+=nums[i];
            rightSum=totalSum-leftSum;
            if(leftSum>=rightSum){
                count++;
            }

        }
        return count;
        

    }
}
