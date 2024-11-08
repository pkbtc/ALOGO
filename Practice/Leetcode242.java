import java.util.*;

public class Leetcode242{
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        boolean ans=isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}