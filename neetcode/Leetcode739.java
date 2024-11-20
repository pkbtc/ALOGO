import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Leetcode739{
    public static void main(String[] args) {
        int[] temp={73,74,75,71,69,72,76,73};
        int[] ans=new Leetcode739().dailyTemperatures(temp);
        System.out.println(Arrays.toString(ans));
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Deque<Integer> stack=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int index=stack.pop();
                ans[index]=i-index;
            }
            stack.push(i);

        }
        return ans;
    }
}