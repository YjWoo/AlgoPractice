package com.leetcode3;

public class Y_isPalindrome {
	// 判断字符串是否是回文
	public static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int head = 0, tail = s.length() - 1;
		char cHead, cTail;
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("a man,am,a"));
		System.out.println(isPalindrome("a man,is you"));
	}
}
