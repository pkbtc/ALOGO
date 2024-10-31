import java.util.*;

class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));

        long[][] memo = new long[robot.size()][factory.length];
        for (long[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dfs(0, 0, robot, factory, memo);
    }

    private long dfs(int i, int j, List<Integer> robot, int[][] factory, long[][] memo) {
        if (i == robot.size()) {
            return 0;
        }
        if (j == factory.length) {
            return Long.MAX_VALUE;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        long ans = dfs(i, j + 1, robot, factory, memo);

        long totalDistance = 0;
        for (int k = 0; k < factory[j][1]; k++) {
            if (i + k >= robot.size()) {
                break;
            }
            totalDistance += Math.abs(robot.get(i + k) - factory[j][0]);

            long next = dfs(i + k + 1, j + 1, robot, factory, memo);
            if (next != Long.MAX_VALUE) {
                ans = Math.min(ans, totalDistance + next);
            }
        }
        memo[i][j] = ans;
        return ans;
    }
}
