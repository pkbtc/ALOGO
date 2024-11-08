public class Leetcode873 {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        System.out.println(new Leetcode873().minEatingSpeed(piles,8));
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i]>end){
                end=piles[i];
            }
        }

        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isEatingPossible(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isEatingPossible(int[] piles,int eatingSpeed,int h){
            int hourSpend=0;
            for(int i=0;i<piles.length;i++){
                hourSpend+=piles[i]/eatingSpeed;
                if(piles[i]%eatingSpeed!=0){
                    hourSpend++;
                }
                if(hourSpend>h){
                    return false;
                }
            }
            return true;
    }
}
