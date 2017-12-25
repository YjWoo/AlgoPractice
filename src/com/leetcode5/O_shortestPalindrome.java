package com.leetcode5;

public class O_shortestPalindrome {
	// 返回包含s的最短回文
	public String shortestPalindrome(String s) {
		int n = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == s.charAt(n)) {
				n += 1;
			}
		}
		if (n == s.length()) {
			return s;
		}
		String suffix = s.substring(n);
		return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, n)) + suffix;
	}
}
