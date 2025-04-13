public class Leetcode50 {
    public static void main(String[] args) {
        System.out.println(new Leetcode50().myPow(2,10));
    }
    public double myPow(double x, int n) {
        long N = Math.abs((long)n);
        double ans=1.0;
        while(N>=1){
            if((N&1)==1){
                ans*=x;
            }
            N/=2;
            x*=x;

        
        }

        return n<0?1/ans:ans;
    }
}
