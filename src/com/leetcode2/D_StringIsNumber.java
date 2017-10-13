package com.leetcode2;

public class D_StringIsNumber {
	// 判断字符串是否为数字
	public boolean isNumber(String s) {
		s = s.trim();
		boolean pointSeen = false;// 是否看到小数点
		boolean eSeen = false;// 是否看到e，表示幂
		boolean numberSeen = false;// 是否看到数字
		boolean numberAfterE = true;// 是否在看到e后看到数字
		for (int i = 0; i < s.length(); i++) {
			if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
				numberSeen = true;
				numberAfterE = true;
			} else if (s.charAt(i) == '.') {
				if (eSeen || pointSeen) {
					return false;
				}
				pointSeen = true;
			} else if (s.charAt(i) == 'e') {
				if (eSeen || !numberSeen) {
					return false;
				}
				numberAfterE = false;
				eSeen = true;
			} else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
				if (i != 0 && s.charAt(i - 1) != 'e') {
					return false;
				}
			} else {
				return false;
			}
		}
		return numberSeen && numberAfterE;
	}

	// 逗比解法
	public boolean isNumberIdiot(String s) {
		try {
			double d = Double.parseDouble(s);
			System.out.println(d);
		} catch (Exception e) {
			return false;
		}
		return true;

	}
}
