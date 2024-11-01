import java.util.*;
public class Leetcode383 {
    public static void main(String[] args) {
        String ransomNote="a";
        String magazine="b";
        boolean ans=new Leetcode383().canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(map.containsKey(c)&& map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
