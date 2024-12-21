import java.util.Arrays;
//INSETION SORT IN THIS SORT THE ELEMENT TO BE SORTED IS INSERTED AT THE CORRECT POSITION 
//IT IS A INPLACE SORT
//IT IS A STABLE SORT
//IN THIS THE ELEMENT IS SENT TO THE FIRST POSITION
//IT IS A O(N^2)
//IT IS A O(1)
//A REGION IS TAKEN AND THE ELEMENT IS SORTED IN THAT REGION AND IN NEXT LOOP THE 
//REGION IS EXPANED AND SORTED AGAIN IN THAT REGION

public class insertion {
    public static void main(String[] args) {
        int arr[] ={4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
