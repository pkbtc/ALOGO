public class Leecode670 {
    public static void main(String[] args) {
        int num=2736;
        int ans=maximumSwap(num);
        System.out.println(ans);
    }
    public static int maximumSwap(int num) {
        char numAr[]=Integer.toString(num).toCharArray();
        int n=numAr.length;
        char maxElement=numAr[n-1];
        int maxIndex=n-1;
        int swapIdx1=-1;
        int swapIdx2=-1;
        for(int i=n-2;i>=0;i--){
            if(numAr[i]>maxElement){
                maxElement=numAr[i];
                maxIndex=i;
            }
            else if(numAr[i]<maxElement){
                swapIdx1=i;
                swapIdx2=maxIndex;
            }
        }
        if(swapIdx1!=-1){
            char temp=numAr[swapIdx1];
            numAr[swapIdx1]=numAr[swapIdx2];
            numAr[swapIdx2]=temp;
        }
        return Integer.parseInt(new String(numAr));
    }
}
