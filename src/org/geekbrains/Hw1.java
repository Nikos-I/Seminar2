package org.geekbrains;

public class Hw1 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int curArea = dfs(grid, i, j);
                    if (maxArea < curArea) {
                        maxArea = curArea;
                    }
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j) {
        int curArea;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        } else {
            grid[i][j] = 0;
            curArea = (1 + dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1));
            return curArea;
        }
    }
}
