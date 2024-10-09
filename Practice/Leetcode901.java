
import java.util.*;
public class Leetcode901 {
    public static void main(String[] args) {
        
    }
    Stack<Integer> stack;
        ArrayList<Integer> list;
    public StockSpanner() {
        stack=new Stack<>();
        list=new ArrayList<>();
        
    }
    public int next(int price) {
        list.add(price);
        while(!stack.isEmpty() && list.get(stack.peek())<=price){`
            stack.pop();


        }
        int prevGreaterElement=(stack.isEmpty()?-1:stack.peek());
        int currentIndex=list.size()-1;
        int ans=currentIndex-prevGreaterElement;
        stack.push(currentIndex);
        return ans;
    }
}
