import java.util.Stack;

public class Leetcode735 {
    public static void main(String[] args) {
        
    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if(stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            } 
            else {
                
                while(!stack.isEmpty()){
                int top=stack.peek();
                if(top<0){
                    stack.push(asteroids[i]);
                    break;
                }
                int modval=Math.abs(asteroids[i]);
                if(modval==top){
                    stack.pop();
                    break;
                }
                else if(modval<top){
                    break;
                }
                else {
                    stack.pop();
                    if(stack.isEmpty()){
                        stack.push(asteroids[i]);
                        break;
                    }
                }}

            }
        }
        int[] ansArray=new int[stack.size()];
        for (int i = stack.size()-1; i >=0; i--) {
            ansArray[i]=stack.get(i);
        }
        return ansArray;
        }
}
