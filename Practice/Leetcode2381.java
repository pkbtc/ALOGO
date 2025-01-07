public class Leetcode2381 {
    public static void main(String[] args) {
        
    }
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int[] arr=new int[n];
        for(int[] shift:shifts){
            if(shift[2]==1){
                arr[shift[0]]++;
                if(shift[1]+1<n){
                    arr[shift[1]+1]--;
                }
            }
            else {
                arr[shift[0]]--;
                if(shift[1]+1<n){
                    arr[shift[1]+1]++;
                }
            }
        }
        
    }
}
