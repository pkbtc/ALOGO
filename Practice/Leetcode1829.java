import java.util.Arrays;

public class Leetcode1829 {
    public static void main(String[] args) {
        int nums[]={0,1,1,3};
        int maximumBit=2;
        int[] ans=new Leetcode1829().getMaximumXor(nums,maximumBit);
        System.out.println(Arrays.toString(ans));
    }
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int[] result=new int[n];

        int cumulativeXor=0;

        for(int num:nums){
            cumulativeXor^=num;
        }

        int mask=(1<<maximumBit)-1;

        for(int i=n-1;i>=0;i--){
            result[i]=cumulativeXor^mask;
            cumulativeXor^=nums[i];
        }
        int[] finalResult=new int[n];
        for(int i=0;i<n;i++){
            finalResult[i]=result[n-1-i];
        }
        
        return finalResult;
    }

}
