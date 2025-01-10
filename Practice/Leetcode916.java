import java.util.List;
import java.util.*;
public class Leetcode916 {
    public static void main(String[] args) {
        String[] word1={"amazon","apple","facebook","google","leetcode"};
        String[] word2={"e","o"};
        System.out.println(new Leetcode916().wordSubsets(word1,word2));
    }
        public List<String> wordSubsets(String[] words1, String[] words2) {
            int freq[] =new int[26];
            for(String word:words2){
                int temp[] =getFreq(word);
                for(int i=0;i<26;i++){
                    freq[i]=Math.max(freq[i],temp[i]);
                }
            }
            List<String> res=new ArrayList<>();
            for(String word:words1){
                int temp[] =getFreq(word);
                boolean flag=true;
                for(int i=0;i<26;i++){
                    if(freq[i]>temp[i]){
                        flag=false;
                        break;
                    }
                    
                }
                if(flag){
                    res.add(word);
                }
            }
            return res;

        }
        public int[] getFreq(String word){
            int freq[] =new int[26];
            for(int i=0;i<word.length();i++){
                freq[word.charAt(i)-'a']++;

            }
            return freq;
        }
}
