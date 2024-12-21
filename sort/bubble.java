import java.util.Arrays;
//BUBBLE SORT IN THIS SORT THE LARGEST ELEMENT IS SENT TO THE LAST POSITION
//IT IS A INPLACE SORT
//IT IS A STABLE SORT
//IT IS A O(N^2)
//IT IS A O(1)
//IN THIS THE TWO ELEMNET ARE CHECK AND SORTED ON THE BASED OF THERE SIZE
public class bubble {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        //System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    static void bubble(int arr[]){
        int n=arr.length;
        int passed=n-2;
        for(int i=0;i<=passed;i++){
            boolean flag=false;
            for(int j=0;j<=passed-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            System.out.println("after pass"+i);
            System.out.println(Arrays.toString(arr));
            if(!flag){
                System.out.println("no swap");
                break;
            }
        }
    }
    static void swap(int arr[] ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
