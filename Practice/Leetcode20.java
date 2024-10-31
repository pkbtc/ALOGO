import java.util.*;
public class Leetcode20 {
    public static void main(String[] args) {
        String s="()[]{}";
        boolean ans=new Leetcode20().isValid(s);
        System.out.println(ans);
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if((top=='(' && ch==')') || (top=='[' && ch==']') || (top=='{' && ch=='}')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
