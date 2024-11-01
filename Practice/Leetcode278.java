public class Leetcode278 extends VersionControl {
    public static void main(String[] args) {
        
    }
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
