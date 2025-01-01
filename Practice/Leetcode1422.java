public class Leetcode1422{
    public static void main(String[] args) {
        System.out.println(new Leetcode1422().maxScore("011101"));
    }
    public int maxScore(String s) {
        int n=s.length();
        int ones=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        
        }
        int zero=0;
        int res=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else {
                ones--;
            }
            res=Math.max(res,ones+zero);
        }
        return res;
    }
}