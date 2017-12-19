package com.leetcode5;

public class G_rangeBitwiseAnd {
	// 返回[m,n]区间所有值的与运算
	public int rangeBitwiseAnd(int m, int n) {
		if (m == 0) {
			return 0;
		}
		int moveFactor = 1;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			moveFactor <<= 1;
		}
		return m * moveFactor;
	}
}
