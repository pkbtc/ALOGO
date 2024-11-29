public class Leetcode28 {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";
        int ans=new Leetcode28().strStr(haystack,needle);
        System.out.println(ans);
    }
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }

        int m=needle.length();
        int n=haystack.length();
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
