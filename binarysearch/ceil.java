public class ceil {
    public static void main(String[] args) {
        int arr[]={4,4,8,8,8,15,16,23,23,42};
        System.out.println(ceil(arr,3));
    }
    static int ceil(int[] arr,int target){
        int start = 0;
        int ans=-1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {

                end = mid - 1;
                ans=arr[mid];

            } else if (target > arr[mid]) {
                start = mid + 1;
                
            } else {
                ans=arr[mid];
            }
        }
        return ans;
    }
}
