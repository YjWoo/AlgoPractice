package com.leetcode5;

public class D_rob {
	// 今夜实行抢劫计划，num表示房间内的金钱，相邻房间被抢会报警，返回安全抢劫的最大金额 DP
	public int rob(int[] num) {
		int[][] dp = new int[num.length + 1][2];
		for (int i = 1; i <= num.length; i++) {
			dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
			dp[i][1] = num[i - 1] + dp[i - 1][0];
			System.out.println(dp[i][1]);
		}
		return Math.max(dp[num.length][0], dp[num.length][1]);
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 67, 43, 213, 324, 6, 43, 123, 12, 4, 23 };
		System.out.println(new D_rob().rob(array));
	}
}
