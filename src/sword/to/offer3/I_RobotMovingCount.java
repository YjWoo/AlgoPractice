package sword.to.offer3;

public class I_RobotMovingCount {
	/*
	 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动， 每一次只能向左，右，上，下四个方向移动一格，
	 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 请问该机器人能够达到多少个格子？使用 动态规划。
	 */
	public int movingCount(int threshold, int rows, int cols) {
		if (threshold < 0)
			return 0;
		boolean[][] dp = new boolean[rows + 1][cols + 1];
		dp[0][0] = true;
		for (int i = 1; i <= rows; i++) {// 初始化
			if (dp[i - 1][0] && canreach(threshold, i, 0)) {
				dp[i][0] = true;
			} else {
				dp[i][0] = false;
			}
		}
		for (int i = 1; i <= cols; i++) {// 初始化
			if (dp[0][i - 1] && canreach(threshold, 0, i)) {
				dp[0][i] = true;
			} else {
				dp[0][i] = false;
			}
		}
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if ((dp[i - 1][j] && canreach(threshold, i, j)) || (dp[i][j - 1] && canreach(threshold, i, j))) {
					dp[i][j] = true;
				} else {
					dp[i][j] = false;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (dp[i][j])
					count++;
			}
		}
		return count;
	}

	public boolean canreach(int threshold, int x, int y) {
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}
		while (y > 0) {
			sum += y % 10;
			y /= 10;
		}
		return sum <= threshold;
	}
}
