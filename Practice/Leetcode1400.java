public class Leetcode1400 {
    public static void main(String[] args) {
        System.out.println(new Leetcode1400().canConstruct("cr",7));
    }
    public boolean canConstruct(String s, int k) {
        if(k>s.length()){
            return false;
        }
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        int odds=0;
        for(int c:count){
            if(c%2==1){
                odds++;
            }

        }
        return odds<=k;
    }
}
