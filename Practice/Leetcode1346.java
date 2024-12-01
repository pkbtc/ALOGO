import java.util.*;
public class Leetcode1346 {
    public static void main(String[] args) {
        System.out.println(new Leetcode1346().checkIfExist(new int[]{10,2,5,3}));
    }
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num*2) || (num%2==0 && set.contains(num/2))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
