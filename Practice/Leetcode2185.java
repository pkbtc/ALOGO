public class Leetcode2185 {
    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};
        String pref="at";
        System.out.println(new Leetcode2185().prefixCount(words, pref));
    }
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
