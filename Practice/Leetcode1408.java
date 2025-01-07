import java.util.*;
public class Leetcode1408 {
    public static void main(String[] args) {
        String[] words={"mass","as","hero","superhero"};
        List<String> ans=new Leetcode1408().stringMatching(words);
        System.out.println(Arrays.toString(ans.toArray()));
    }
    public List<String> stringMatching(String[] words) {
        Set<String> list=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    list.add(words[j]);
                }
            }
        }
        return new ArrayList<>(list);
    }
    
    
}
