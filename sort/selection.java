import java.util.Arrays;
// SELECTION SORT
//Selection Sort is a simple comparison-based sorting algorithm. 
//It works by repeatedly selecting the smallest (or largest, depending on the order) element from the unsorted portion of the array and placing it in the correct position.
//Move the boundary of the sorted and unsorted portions of the array by one position and repeat until the entire array is sorted.

public class selection {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bidirectional(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;

                }

            }
            swap(arr,i,minIndex);
        }
    }
    static void bidirectional(int arr[]){
        int n=arr.length;
        int k=n-1;
        for(int i=0;i<k;i++){
            int minIndex=i;
            int maxIndex=i;
            for(int j=i+1;j<=k;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                  
                }
                else if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                  
                }
            }
            swap(arr,i,minIndex);
            if(maxIndex==i){
                maxIndex=minIndex;
            }
            swap(arr,k,maxIndex);
            k--;

        }

    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
