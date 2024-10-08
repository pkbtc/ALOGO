import java.util.Stack;

public class Leetcode1963 {
    public static void main(String[] args) {
        String s="][][";
        int ans=minSwaps(s);
        System.out.println(ans);
    }
    public static int minSwaps(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty() || stack.peek()==']'){
                    stack.push(ch);
                }
                else {
                    stack.pop();
                }
            }
        }
        int totalBrackets=stack.size();
        int closedBracket=totalBrackets/2;
        return (closedBracket+1)/2;
    }
}
