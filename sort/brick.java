import java.util.Arrays;

public class brick {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println(Arrays.toString(arr));
        brick(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void brick(int arr[]){
        boolean isSorted=false;

        while(!isSorted){
            boolean flag=false;
            for(int i=0;i<arr.length-1;i+=2){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    flag=true;
                }
            }
            for(int i=1;i<arr.length-2;i+=2){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    flag=true;
                }
            }
            if(!flag){
                isSorted=true;
                break;
            }
        }
        
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
