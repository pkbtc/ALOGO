import java.util.*;
public class Leetcode1910 {
    public static void main(String[] args) {
        System.out.println(new Leetcode1910().removeOccurrences("daabcbaabcbc", "abc"));
    }
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int m=part.length();

        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            if(sb.length()>=m){
                String sub=sb.substring(sb.length()-m);
                if(sub.equals(part)){
                    sb.setLength((sb.length()-m));
                }
            }
        }
        return sb.toString();
        
    }
}
