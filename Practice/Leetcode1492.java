import java.util.*;
public class Leetcode1492 {
    public static void main(String[] args) {
        System.out.println(new Leetcode1492().kthFactor(12,3));
    }
    public int kthFactor(int n, int k) {
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        
        for(int i=0;i<factors.size();i++){
            if(i==k-1){
                return factors.get(i);
            }
        }
        return -1;
    }
}
