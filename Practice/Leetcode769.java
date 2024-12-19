public class Leetcode769 {
    public static void main(String[] args) {
        System.out.println(new Leetcode769().maxChunksToSorted(new int[]{4,3,2,1,0}));
    }
    public int maxChunksToSorted(int[] arr) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
            if(max<i+1){
                count++;
            }
        }   
        return count;
    }
}
