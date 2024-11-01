import java.util.*;

public class Leetcode1957 {

    public static void main(String[] args) {
        String s="leeetcode";
        String ans=makeFancyString(s);
        System.out.println(ans);
    }
    public static String makeFancyString(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.size()>=2 && stack.get(stack.size()-1)==ch && stack.get(stack.size()-2)==ch){
                continue;
                
            }
            else {
                stack.push(ch);
            }


        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
