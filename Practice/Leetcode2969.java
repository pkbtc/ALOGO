import java.util.*;
public class Leetcode2969 {
    public static void main(String[] args) {
        String s="ABFCACDB";
        int ans=minLength(s);
        System.out.println(ans);

    }
    public static int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty()){
                char top=stack.peek();
                if((top=='A' && arr[i]=='B') || (top=='C' && arr[i]=='D')){
                    stack.pop();
                    continue;
                }
                
                   
            }
            stack.push(arr[i]);
            }
            return stack.size();
        }
        
    }

