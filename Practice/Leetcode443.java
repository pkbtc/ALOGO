import java.util.*;
public class Leetcode443 {
    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c'};
        System.out.println(new Leetcode443().compress(chars));
    }
    public int compress(char[] chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        int index=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            chars[index++]=entry.getKey();
            if(entry.getValue()>1){
                String value=entry.getValue().toString();
                for(int i=0;i<value.length();i++){
                    chars[index++]=value.charAt(i);
                }
            }
        }
        return index;
    }
}
