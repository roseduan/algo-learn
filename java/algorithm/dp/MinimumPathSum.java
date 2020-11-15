package algorithm.dp;

/**
 * @author roseduan
 * 最小路径和
 */
public class MinimumPathSum {

    public int minPathSum1(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                } else if (j == 0 && i > 0) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                } else if (i > 0 && j > 0) {
                    dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    /**
     * 简化一维的写法
     */
    public int minPathSum2(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[i] = grid[0][i] + dp[i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[j] += grid[i][j];
                } else {
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
                }
            }
        }
        return dp[n - 1];
    }

    /**
     * 原数组上修改
     */
    public int minPathSum3(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
