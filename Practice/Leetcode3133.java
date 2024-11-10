public class Leetcode3133 {
    public static void main(String[] args) {
        
    }
    public static long midEnd(int n,int x){
        int i=0;
        long m=n;
        long ans=x;
        m--;
        while(m>0){
            while(((1<<i)&m)!=0){
                i++;
            }
            ans|=((m&1)<<i);
            i++;
            m>>=1;
        }
        return ans;
    }
}
