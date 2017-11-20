package com.leetcode3;

public class W_maxProfit {
	// Best Time to Buy and Sell Stock，返回数组中最大差值
	public static int maxProfit(int[] prices) {
		int maxCur = 0, maxSoFar = 0;
		for (int i = 1; i < prices.length; i++) {
			maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
			maxSoFar = Math.max(maxCur, maxSoFar);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int[] prices = { 1, 3, 5, 2, 9, 4 };

		System.out.println(maxProfit(prices));
	}
}
