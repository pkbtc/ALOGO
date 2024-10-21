import java.util.*;

public class Leetcode1593 {
  static  int maxCount=0;
    public static void main(String[] args) {
        String s="aba";
        int ans=maxUniqueSplit(s);
        System.out.println(ans);
    }
    public static int maxUniqueSplit(String s) {
        HashSet<String> set=new HashSet<>();
        backtract(s,set,0);
        return maxCount;
    }
    public static void backtract(String s,HashSet<String> set,int index){
        if(index==s.length()){
            maxCount=Math.max(maxCount,set.size());
            return;
        }
        for(int i=index;i<s.length();i++){
            String sub=s.substring(index,i+1);
            if(!set.contains(sub)){
                set.add(sub);
                backtract(s,set,i+1);
                set.remove(sub);
            }
        }
    }
}
