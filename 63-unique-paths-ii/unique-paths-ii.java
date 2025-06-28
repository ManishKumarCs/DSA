class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }

        return solve(obstacleGrid, m - 1, n - 1, memo);
    }

    static int solve(int[][] obstacleGrid, int i, int j, int[][] memo) {
        if (i < 0 || j < 0) return 0;
        if (obstacleGrid[i][j] == 1) return 0;
        if (i == 0 && j == 0) return obstacleGrid[0][0] == 0 ? 1 : 0;
        if (memo[i][j] != -1) return memo[i][j];

        int top = solve(obstacleGrid, i - 1, j, memo);
        int left = solve(obstacleGrid, i, j - 1, memo);

        memo[i][j] = top + left;
        return memo[i][j];
    }
}
