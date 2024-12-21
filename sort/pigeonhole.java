import java.util.Arrays;

public class pigeonhole {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        pigeonhole(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void pigeonhole(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        if(max==arr[0] || min==Integer.MAX_VALUE){
            System.out.println("array is empty");
            return;
        }
        int pigeonHole[]=new int[max-min+1];
        for(int i=0;i<n;i++){
            pigeonHole[arr[i]-min]++;
        } 
        int index=0;
        for(int j=0;j<pigeonHole.length;j++){
            while(pigeonHole[j]>0){
                arr[index]=j+min;
                index++;
                pigeonHole[j]--;
            }
        }
        System.out.println(Arrays.toString(pigeonHole));


       }
}
