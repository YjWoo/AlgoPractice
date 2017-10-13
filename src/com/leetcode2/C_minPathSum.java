package com.leetcode2;

import java.util.ArrayList;
import java.util.Collections;

public class C_minPathSum {
	// 求矩阵第一个元素到最后一个元素之间的最短路径，递归法，时间复杂度高
	public static int minPathSum(int[][] grid) {
		if (grid.length == 1 && grid[0].length == 1)
			return grid[0][0];
		ArrayList<Integer> result = new ArrayList<>();
		eachPath(grid, 0, 0, 0, result);
		Collections.sort(result);
		System.out.println(result);
		return result.get(0);
	}

	public static void eachPath(int[][] grid, int m, int n, int k, ArrayList<Integer> list) {
		if (m >= grid.length || n >= grid[0].length)
			return;
		k += grid[m][n];
		if (m == grid.length - 1 && n == grid[0].length - 1)
			list.add(k);
		eachPath(grid, m + 1, n, k, list);
		eachPath(grid, m, n + 1, k, list);
	}

	// 动态规划，时间复杂度低
	public static int minPathSumDP(int[][] grid) {
		for (int i = 1; i < grid.length; i++) {
			grid[i][0] += grid[i - 1][0];
		}
		for (int i = 1; i < grid[0].length; i++) {
			grid[0][i] += grid[0][i - 1];
		}
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				grid[i][j] = Math.min(grid[i - 1][j] + grid[i][j], grid[i][j - 1] + grid[i][j]);
			}
		}
		return grid[grid.length - 1][grid[0].length - 1];
	}

	public static void main(String[] args) {
		int[][] arr = { { 9, 1, 4, 8, 1 }, { 9, 1, 4, 8, 1 }, { 9, 1, 4, 8, 1 }, { 9, 1, 4, 8, 1 }, { 9, 1, 4, 8, 1 } };

		System.out.println(minPathSum(arr));
		System.out.println(minPathSumDP(arr));
	}
}
