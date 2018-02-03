package com.leetcode7;

public class D_coinChange {
	// coins表示硬币面值，amount表示总金额，返回最小硬币数(DP)
	public int coinChange(int[] coins, int amount) {
		if (amount < 1)
			return 0;
		int[] dp = new int[amount + 1];
		int sum = 0;
		while (++sum <= amount) {
			int min = -1;
			for (int coin : coins) {
				if (sum >= coin && dp[sum - coin] != -1) {
					int temp = dp[sum - coin] + 1;
					min = min < 0 ? temp : (temp < min ? temp : min);
				}
			}
			dp[sum] = min;
		}
		return dp[amount];
	}
	
	public static void main(String[] args) {
		int[] coins={1,2,5,10,20,50,100};
		System.out.println(new D_coinChange().coinChange(coins, 168));
	}
}
