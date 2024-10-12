public class Leetcode2046 {
    public static void main(String[] args) {
        int[][] intervals={{5,10},{6,8},{1,5},{2,3},{1,10}};
        int ans=minGroups(intervals);
        System.out.println(ans);
    }
    public static int minGroups(int[][] intervals) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            min=Math.min(min, intervals[i][0]);
            max=Math.max(max, intervals[i][1]);
        }
        int[] count=new int[max+2];
        for (int i = 0; i < intervals.length; i++) {
            count[intervals[i][0]]++;
            count[intervals[i][1] + 1]--;
        }
        int maxOeverlap=0;
        int sum=0;
        for(int i=min;i<max+2;i++){
            sum+=count[i];
            maxOeverlap=Math.max(maxOeverlap, sum);
        }
        return maxOeverlap;
    }

    
}
