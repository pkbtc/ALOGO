import java.util.*;
public class Leetcode1106 {
    public static void main(String[] args) {
        String ex="&(|(f))";
        boolean ans=parseBoolExpr(ex);
        System.out.println(ans);
    }
    public static boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch==')'){
                ArrayList<Character> list=new ArrayList<>();
                
                while(stack.peek()!='('){
                    list.add(stack.pop());
                }
                stack.pop();
               char op=stack.pop();
                char ans=helper(list,op);
                stack.push(ans);
            }
            else {
                if(ch!=','){
                    stack.push(ch);
                }
            }
        }
        return stack.peek()=='t';
    }
    public static char helper(ArrayList<Character> list,char op){
        if(op=='&'){
            if(find(list ,'f')){
                return 'f';
            }
            else {
                return 't';
            }
        }
       else if(op=='|'){
            if(find(list,'t')){
                return 't';
            }
            else {
                return 'f';
            }
        }
        else {
            return list.get(0)=='f'?'t':'f';
                }
    }
    public static boolean find(ArrayList<Character> list,char op){
        for(char ch:list){
            if(ch==op){
                return true;
            }
            
        }
        return false;
    }

}
