import java.util.*;
public class Leetcode796 {
    public static void main(String[] args) {
        String s="abcde";
        String goal="abced";
        Boolean ans=new Leetcode796().rotateString(s,goal);
        System.out.println(ans);
    }
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String s1=s.concat(s);
        if(s1.contains(goal)){
            return true;
        }
        return false;
    }   
}
