public class Leetcode1101 {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int ans=shipWithinDays(weights,5);
        System.out.println(ans);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int res=-1;
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>start){
                start=weights[i];
            }
            end+=weights[i];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isShipmentPossible(weights, mid, days)){
                res=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return res;
    }
    public static boolean isShipmentPossible(int[] weights,int maxWeight,int days){
            int currWeight=0;
            int currDays=1;
            for (int i = 0; i < weights.length; i++) {
                currWeight+=weights[i];
                if(currWeight>maxWeight){
                    currDays++;
                    currWeight=weights[i];
                }
                if(currWeight>maxWeight){
                    return false;
                }


            }
            return true;

    }
}
