package com.leetcode2;

public class A_uniquePaths {
	// 寻找从(1,1)到(m,n)有多少条路径，只能下移或右移，递归解法，时间复杂度高
	public static int uniquePaths(int m, int n) {
		int[] k = new int[1];
		k[0] = 0;
		eachPath(m, n, k);
		return k[0];
	}

	public static void eachPath(int m, int n, int[] k) {
		if (m < 1 || n < 1)
			return;
		if (m == 1 && n == 1)
			k[0]++;
		eachPath(m - 1, n, k);
		eachPath(m, n - 1, k);
	}

	// 采用动态规划实现，时间复杂度低
	public static int uniquePathsDP(int m, int n) {
		Integer[][] map = new Integer[m][n];
		for (int i = 0; i < m; i++) {
			map[i][0] = 1;
		}
		for (int j = 0; j < n; j++) {
			map[0][j] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}
		return map[m - 1][n - 1];
	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(12, 12));
		System.out.println(uniquePathsDP(12, 12));
	}
}
