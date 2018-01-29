package com.leetcode6;

public class Z_maxProfit {
	// prices为每天股票价格，可以多次买入一次卖出，卖出后冷却一天，求最大利润
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1)
			return 0;

		int b0 = -prices[0], b1 = b0;
		int s0 = 0, s1 = 0, s2 = 0;

		for (int i = 1; i < prices.length; i++) {
			b0 = Math.max(b1, s2 - prices[i]);
			s0 = Math.max(s1, b1 + prices[i]);
			b1 = b0;
			s2 = s1;
			s1 = s0;
		}
		return s0;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 67, 43, 213, 324, 6, 43, 123, 12, 4, 23 };
		System.out.println(new Z_maxProfit().maxProfit(array));
	}
}
