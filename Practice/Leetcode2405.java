import java.util.*;
public class Leetcode2405 {
    public static void main(String[] args) {
        String s="abacaba";
        System.out.println(new Leetcode2405().partitionString(s));
        
    }
    public int partitionString(String s) {
        int ans=1;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                ans++;
                set.clear();
            }
            set.add(s.charAt(i));
        }
        return ans;
    }
}
