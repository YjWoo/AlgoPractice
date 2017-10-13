package com.leetcode2;

public class F_addBinary {
	// 两个字符串为二进制数字，返回加和
	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(addBinary(
				"10111101111100010111101111100011011111000101111100010111110001111100011101111100010111110001011111000111110001",
				"10111101111100011101011111001011110111110001101111100010111110001011111000111110001011011110111110001110001001"));
	}
}
