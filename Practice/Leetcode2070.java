import java.util.Arrays;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        int n = items.length;
        int[] maxBeauty = new int[n];
        maxBeauty[0] = items[0][1];
        
        
        for (int i = 1; i < n; i++) {
            maxBeauty[i] = Math.max(maxBeauty[i - 1], items[i][1]);
        }

        int[] result = new int[queries.length];

        
        for (int i = 0; i < queries.length; i++) {
            result[i] = bs(items, maxBeauty, queries[i]);
        }
        
        return result;
    }

    public static int bs(int[][] items, int[] maxBeauty, int query) {
        int start = 0;
        int end = items.length - 1;

        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (items[mid][0] <= query) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        
        if (end == -1) {
            return 0;
        }
        return maxBeauty[end];
    }
}
