package com.leetcode1;

public class Q_myPow {
	// 求幂运算，时间复杂度O(logn)
	public static double myPow(double x, int n) {
		if (x == 1 || n == 0)
			return 1;
		if (n < 0)
			return myPow(1 / x, -n % -2147483648);
		if (n <= 1)
			return x;
		if (n % 2 == 1)
			return myPow(x * x * x, n / 2);
		else
			return myPow(x * x, n / 2);
	}

	public static void main(String[] args) {
		System.out.println(myPow(8.84372, -5));
		System.out.println(myPow(8, 2));
		System.out.println(myPow(8, 11));
	}
}
