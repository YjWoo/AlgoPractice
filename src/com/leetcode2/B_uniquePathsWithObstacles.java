package com.leetcode2;

public class B_uniquePathsWithObstacles {
	//续uniquePaths，传入数组设置障碍，0可以通过，1不能通过，求路径
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int width = obstacleGrid[0].length;
		int[] dp = new int[width];
		dp[0] = 1;
		for (int[] row : obstacleGrid) {
			for (int j = 0; j < width; j++) {
				if (row[j] == 1)
					dp[j] = 0;
				else if (j > 0)
					dp[j] += dp[j - 1];
			}
		}
		return dp[width - 1];
	}

	public static void main(String[] args) {
		int[][] arr={{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,0}};
		
		System.out.println(uniquePathsWithObstacles(arr));
	}
}
