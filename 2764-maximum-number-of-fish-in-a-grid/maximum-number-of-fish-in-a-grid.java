class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    maxFish = Math.max(maxFish, dfs(grid, i, j));
                }
            }
        }
        return maxFish;
        
    }
    public int dfs(int[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0)return 0;
        int fish = grid[x][y];
        grid[x][y] = 0;
        fish+=dfs(grid,x+1,y);
        fish+=dfs(grid,x,y+1);
        fish+=dfs(grid,x-1,y);
        fish+=dfs(grid,x,y-1);
        return fish;
    }
}