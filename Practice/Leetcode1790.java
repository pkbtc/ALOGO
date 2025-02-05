import java.util.*;
public class Leetcode1790 {
    public static void main(String[] args) {
        System.out.println(new Leetcode1790().areAlmostEqual("bank","kanb"));
    }
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            return false;
        }
        int first=-1;
        int second=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>2){
                    return false;
                }
                if(first==-1){
                    first=i;
                }
                else{
                    second=i;
                }

            }
            


        }
        if(count==0){
            return true;
        }
        if(count==2){
            return s1.charAt(first)==s2.charAt(second) && s1.charAt(second)==s2.charAt(first);
        }
        return false;
    }

}
