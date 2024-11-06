public class Leetcode3163 {
    public static void main(String[] args) {
        String word="abcde";
        String ans=compressedString(word);
        System.out.println(ans);
    }
    public static String compressedString(String word) {
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<word.length();){
            int count=1;

            while(i+count<word.length() && word.charAt(i+count)==word.charAt(i)){
                count++;
            }
            for(int j=count;j>0;j-=9){
                ans.append(Math.min(9,j)).append(word.charAt(i));
            }
            i+=count;
        }
        return ans.toString();


    }
}
