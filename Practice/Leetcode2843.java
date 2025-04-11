public class Leetcode2843 {
    public static void main(String[] args) {
        System.out.println(new Leetcode2843().countSymmetricIntegers(1,100));
    }
    public int countSymmetricIntegers(int low, int high) {
            int result=0;
            for(int i=low;i<=high;i++){
                String strNum=Integer.toString(i);

                if(strNum.length()%2!=0){
                    continue;
                }

                int n=strNum.length()/2;
                int firstSum=0;
                int secondSum=0;
                for(int j=0;j<n;j++){
                    firstSum+=strNum.charAt(j)-'0';
                    secondSum+=strNum.charAt(j+n)-'0';
                }
                if(firstSum==secondSum){
                    result++;
                }
            }
            return result;
    }
}
