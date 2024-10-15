public class Leetcode2938 {
    public static void main(String[] args) {
        String s="100";
        long ans=minimumSteps(s);
        System.out.println(ans);
    }
    public static long minimumSteps(String s) {
        int n=s.length();
        int last=0;
        long countSwap=0;
        for(int cur=0;cur<n;cur++){
            if(s.charAt(cur)=='1'){
                continue;
            }
            else{
                countSwap+=cur-last;
                last++;
            }
        }
        return countSwap;
    }
}