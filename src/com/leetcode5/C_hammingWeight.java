package com.leetcode5;

public class C_hammingWeight {
	// n转为2进制，返回1的个数
	public int hammingWeight(int n) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result += n & 1;
			n = n >>> 1;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new C_hammingWeight().hammingWeight(4));
		System.out.println(new C_hammingWeight().hammingWeight(7));
		System.out.println(new C_hammingWeight().hammingWeight(8));
		System.out.println(new C_hammingWeight().hammingWeight(127));
		System.out.println(new C_hammingWeight().hammingWeight(128));
	}
}
