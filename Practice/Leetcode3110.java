public class Leetcode3110 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(new Leetcode3110().scoreOfString(s));
    }
    public int scoreOfString(String s) {
            int score=0;
            for(int i=1;i<s.length();i++){
                score+=Math.abs(s.charAt(i)-s.charAt(i-1));
            }
            return score;
    }
}
