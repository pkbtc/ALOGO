import java.util.Arrays;

public class Leetcode1769 {
    public static void main(String[] args) {
        int[] ans=minOperations("110");
        System.out.println(Arrays.toString(ans));
    }
    public static int[] minOperations(String boxes) {
        int n=boxes.length();
        int left[]=new int[n];
        int right[]=new int[n];
        int result[]=new int[n];
        int count=boxes.charAt(0)-'0';

        for(int i=1;i<n;i++){
            left[i]=left[i-1]+count;
            count+=boxes.charAt(i)-'0';

        }
        count=boxes.charAt(n-1)-'0';
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+count;
            count+=boxes.charAt(i)-'0';
        }
        for(int i=0;i<n;i++){
            result[i]=left[i]+right[i];
        }
        return result;

    }
}
