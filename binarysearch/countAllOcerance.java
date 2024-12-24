public class countAllOcerance {
    public static void main(String[] args) {
        int arr[]={4,4,8,8,8,15,16,23,23,42};
        int target = 8;
        int fist=bs(arr,target,true);
        int last=bs(arr,target,false);
        
        System.out.println("count:"+(last-fist+1));
    }
    static int bs(int[] arr ,int target,boolean isFirst){
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                ans=mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
