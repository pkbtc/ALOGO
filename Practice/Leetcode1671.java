import java.util.*;

public class Leetcode1671 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 5, 6, 2, 3, 1};
        int ans = new Leetcode1671().minimumMountainRemovals(nums);
        System.out.println(ans);
    }

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        int[] lds = new int[n];
        Arrays.fill(lis, 1);
        Arrays.fill(lds, 1);

        // Compute LIS for each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // Compute LDS for each element
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        int max = 0;
        // Find the maximum length of mountain sequence
        for (int i = 1; i < n - 1; i++) { // A mountain can't start at the first or end at the last element
            if (lis[i] > 1 && lds[i] > 1) {
                max = Math.max(max, lis[i] + lds[i] - 1);
            }
        }

        return n - max;
    }
}
