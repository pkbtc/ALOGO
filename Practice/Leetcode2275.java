public class Leetcode2275 {
    public static void main(String[] args) {
        int[] can={16,17,71,62,12,24,14};
        System.out.println(new Leetcode2275().largestCombination(can));
    }
    public int largestCombination(int[] candidates) {
            int max=0;
            for(int i=0;i<=24;i++){
                int setBits=0;
                for(int c :candidates){
                    setBits+=(c>>i)&1;
                }
                max=Math.max(max,setBits);
            }   
            return max;
    }
}
