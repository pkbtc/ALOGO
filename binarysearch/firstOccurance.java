public class firstOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,4,5};
        int target=3;
        binarySearch(arr,target,true);
        binarySearch(arr,target,false);
    }
    static void binarySearch(int[] arr,int target,boolean isFirst){
        int start = 0;
        int end = arr.length - 1;
        int ans=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans=mid;
                if(isFirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }
        System.out.println(ans);
    }
}
