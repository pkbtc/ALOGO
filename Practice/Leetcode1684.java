import java.util.*;
public class Leetcode1684 {
    public static void main(String[] args) {
        String all="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(new Leetcode1684().countConsistentStrings(all,words));
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(String str:words){
            boolean flag=true;
            for(int i=0;i<str.length();i++){
                if(!set.contains(str.charAt(i))){
                    flag=false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}
