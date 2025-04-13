public class Leetcode1922 {
    final int MOD=1000000007;
    public static void main(String[] args) {
        System.out.println(new Leetcode1922().countGoodNumbers(4));
    }
    public int countGoodNumbers(long n) {
        return (int)((binaryExponentiation(4, n / 2) * binaryExponentiation(5, n - n / 2)) % MOD);

        
    }
    private long binaryExponentiation(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

}
