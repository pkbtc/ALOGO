public class Leetcode2683 {
    public static void main(String[] args) {
        System.out.println(new Leetcode2683().doesValidArrayExist(new int[]{1,1,0}));
    }
    public boolean doesValidArrayExist(int[] derived) {
        int res=0;
        for(int val:derived){
            res=res^val;
        }
        return (res==0);
    }
}
