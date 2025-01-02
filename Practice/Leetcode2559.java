import java.util.Arrays;
import java.util.HashSet;

public class Leetcode2559 {
    public static void main(String[] args) {
        System.out.println(new Leetcode2559().vowelStrings(new String[]{"aba","bcb","ece","aa","e"},new int[][]{{0,2},{1,4},{1,1}}));
        
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int prefixSum[] =new int[n];
        prefixSum[0]=isVowel(words[0]);
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+isVowel(words[i]);
        }
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int res=prefixSum[r];
            if(l!=0){
                res-=prefixSum[l-1];
            }
            result[i]=res;
        }
        return result;

    }
    public int isVowel(String word){
        HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);
        if(set.contains(first) && set.contains(last)){
            return 1;
        }
        return 0;
    }
}
