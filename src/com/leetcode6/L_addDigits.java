package com.leetcode6;

public class L_addDigits {
	// 返回各位数字加和，直到结果为个位数
	public int addDigits(int num) {
		if (num >= 0 && num <= 9)
			return num;
		int res = 0;
		while (num != 0) {
			res += num % 10;
			num /= 10;
		}
		return addDigits(res);
	}
}
