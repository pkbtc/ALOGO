public class Leetcode1545 {
    public static void main(String[] args) {
        char ans=findKthBit(4,11);
        System.out.println(ans);
    }
    public static char findKthBit(int n, int k) {
        int len=(int)Math.pow(2,n)-1;
        return recurr(len,k);
        }
    public static char recurr(int len,int k){
        if(len==1){
            return '0';
        }
        int half=len/2;
        int middle=half+1;
        if(k==middle){
            return '1';
        }
        else if(k<middle){
            return recurr(half, k);
        }
        else{
            char ans=recurr(half,len-k+1);
            return ans=='0'?'1':'0';
        }
    }
}
