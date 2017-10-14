package com.leetcode2;

public class G_climbStairs {
	// 爬楼梯，每次爬1~2阶，爬到n层有多少种爬法
	public static int climbStairs(int n) {
		int sum = 0;
		int l1 = 1;
		int l2 = 2;
		if (n == 1)
			return l1;
		if (n == 2)
			return l2;
		for (int i = 3; i <= n; i++) {
			sum = l1 + l2;
			l1 = l2;
			l2 = sum;
		}
		return sum;
	}

	// 递归法
	public static int climbStairsRecursion(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(climbStairsRecursion(20));
		System.out.println(climbStairs(44));
	}
}
