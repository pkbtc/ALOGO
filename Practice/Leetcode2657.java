import java.util.Arrays;

public class Leetcode2657 {
    public static void main(String[] args) {
        int a[]={1,3,2,4};
        int b[]={3,1,2,4};
        int ans[]=new Leetcode2657().findThePrefixCommonArray(a,b);
        System.out.println(Arrays.toString(ans));
    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int freq[]=new int[n+1];
        int c[]=new int[n];
        int count=0;
        for (int i = 0; i <n; i++) {
            freq[A[i]]++;
            if(freq[A[i]]==2){
                count++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                count++;
            }
            c[i]=count;
        }
        return c;
    }
}
