import java.util.*;

public class Leetcode409 {
    public static void main(String[] args) {
        String s="abccccdd";
        int ans=new Leetcode409().longestPalindrome(s);
        System.out.println(ans);
    }
    public int longestPalindrome(String s) {
        int length=0;
        boolean hasOdd=false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        for(int count:map.values()){
            if(count%2==0){
                length+=count;
            }
            else {
                length+=count-1;
                hasOdd=true;
            }

        }
        if(hasOdd){
            length+=1;
        }
        return length;
    }
}
