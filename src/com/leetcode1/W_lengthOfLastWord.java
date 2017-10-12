package com.leetcode1;

public class W_lengthOfLastWord {
	// 字符串最后一个空格后的字符个数
	public static int lengthOfLastWord(String s) {
		s = s.trim();
		int num = 0;
		int length = s.length() - 1;
		while (length >= 0 && s.charAt(length) != ' ') {
			num++;
			length--;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World!"));
	}
}
