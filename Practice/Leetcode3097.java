public class Leetcode3097 {
    public static void main(String[] args) {
        System.out.println(new Leetcode3097().minimumSubarrayLength(new int[]{1,2,3},2));
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        int[] bits=new int[32];
        int left=0;
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            addBits(nums[i], bits);

            while(currentBits(bits)>=k && left<=i){
                res=Math.min(res,i-left+1);
                substractBits(nums[left], bits);
                left++;
            }
            
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
    private void addBits(int num,int[] bits){
        int i=0;
        while(num>0){
            bits[i]+=num&1;
             num>>=1;
             i++;
        }
    }
    private void substractBits(int num,int[] bits){
            int i=0;
            while(num>0){
                bits[i]-=num&1;
                num>>=1;
                i++;
            }
    }
    private int currentBits(int[] bits){
        int result=0;
        for (int i = 0; i < 32; i++) {
            if(bits[i]>0){
                result |=(1<<i);
            }
        }
        return result;
    }
}
