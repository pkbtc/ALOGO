public class Leetcode2490 {
    public static void main(String[] args) {
        String sen="leetcode exercises sound delightful";
        System.out.println(new Leetcode2490().isCircularSentence(sen));

    }
    public boolean isCircularSentence(String sentence) {
        String[] s=sentence.split(" ");
        int n=s.length;
        for(int i=0;i<n;i++){
            char last=s[i].charAt(s[i].length()-1);
            char first=s[(i+1)%n].charAt(0);
            if(last!=first){
                return false;
            }

        }
        return true;    
    }
}
