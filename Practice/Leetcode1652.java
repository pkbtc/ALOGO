public class Leetcode1652 {
    public static void main(String[] args) {
        System.out.println(new Leetcode1652().decrypt(new int[]{5,7,1,4},3));
    }
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];

        if(k==0){
            return ans;
        }
        for(int i=0;i<n;i++){
            if(k>0){
                for(int j=1;j<=k;j++){
                    ans[i]+=code[(i+j)%n];
                }
            }
            else {
                for(int j=1;j<=-k;j++){
                    ans[i]+=code[(i-j+n)%n];
                }
            }
        }
        return ans;
    } 
}
