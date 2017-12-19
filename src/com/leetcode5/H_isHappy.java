package com.leetcode5;

import java.util.HashSet;

public class H_isHappy {
	// 判断是否为happy数，即每位数字平方和相加=1 返回true，不为一继续执行操作，无限闭环
	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();
		return isInSet(n, set);
	}

	public boolean isInSet(int n, HashSet<Integer> set) {
		if (n == 1)
			return true;
		int res = 0;
		while (n != 0) {
			res += (n % 10) * (n % 10);
			n /= 10;
		}
		if (set.contains(res))
			return false;
		else
			set.add(res);
		return isInSet(res, set);
	}
}
