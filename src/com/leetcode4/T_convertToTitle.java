package com.leetcode4;

public class T_convertToTitle {
	// Excel Sheet Column Title，1->A,2->B,26->Z,27->AA……
	public String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			n--;
			result.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(new T_convertToTitle().convertToTitle(20));
		System.out.println(new T_convertToTitle().convertToTitle(32));
		System.out.println(new T_convertToTitle().convertToTitle(12));
		System.out.println(new T_convertToTitle().convertToTitle(78));
	}
}
