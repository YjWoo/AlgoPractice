package com.leetcode5;

public class F_numIslands {

	// 二维数组内0代表海，1代表陆地，返回这片海中小岛数量
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;
		int m = grid.length, n = grid[0].length;
		int res = 0;

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j);
					++res;
				}
			}
		}
		return res;
	}

	void dfs(char[][] grid, int i, int j) {
		int m = grid.length;
		int n = grid[0].length;
		if (i < 0 || i >= m || j < 0 || j >= n)
			return;
		if (grid[i][j] == '0')
			return;

		grid[i][j] = '0';
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);

	}
}
