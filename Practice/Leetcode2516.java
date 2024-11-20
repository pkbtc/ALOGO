import java.util.*;
public class Leetcode2516 {
    public static void main(String[] args) {
        System.out.println(new Leetcode2516().takeCharacters("aabaaaacaabc",2));
    }
    public int takeCharacters(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        if(map.getOrDefault('a',0)<k || map.getOrDefault('b', 0)<k || map.getOrDefault('c', 0)<k){
            return -1;
        }
        int n=s.length();
        int maxWindow=0;
        int j=0;

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);

            while(map.getOrDefault('a', 0)<k || map.getOrDefault('b', 0)<k || map.getOrDefault('c', 0)<k){
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
                j++;
            }
            maxWindow=Math.max(maxWindow,i-j+1);
        }
        return n-maxWindow;
    }
}
