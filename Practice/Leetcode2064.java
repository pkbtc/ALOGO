public class Leetcode2064 {
    public static void main(String[] args) {
        int quantities[]={11,6};
        int ans=minimizedMaximum(6, quantities);
        System.out.println(ans);
    }
    public static int minimizedMaximum(int n, int[] quantities) {
        int start=1;
        int res=-1;
        int end=Integer.MIN_VALUE;
        for (int i = 0; i < quantities.length; i++) {
            if(quantities[i]>end){
                end=quantities[i];
            }

        }
        while(start<=end){
            int mid=start+(end-start)/2;

            if(isPossible(mid,quantities,n)){
                res=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return res;
    }
    public static boolean isPossible(int maxProduct,int[] quantities,int n){
        int count=0;

        for (int i = 0; i < quantities.length; i++) {
            count+=quantities[i]/maxProduct;
            if(quantities[i]%maxProduct!=0){
                count++;

            }
            if(count>n){
                return false;
            }

        }
        return true;
}
}
