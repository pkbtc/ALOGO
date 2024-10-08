import java.util.*;

public class CountReversal {
    public static void main(String[] args) {
        String s = "}{{}}{{{";
        int ans = countRev(s);
        System.out.println(ans);
    }

    public static int countRev(String s) {
        
        if (s.length() % 2 == 1) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch == '{') {
                stack.push(ch);
            } 
         
            else {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();  
                } else {
                    stack.push(ch); 
                }
            }
        }

      
        int open = 0, close = 0;
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '{') {
                open++;
            } else {
                close++;
            }
        }

        
        int ans = (open / 2) + (close / 2) + (open % 2) + (close % 2);
        return ans;
    }
}
