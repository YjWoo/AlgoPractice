package com.leetcode6;

public class D_isPowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if (n == 1)
			return true;
		while (n != 0) {
			if (n % 2 == 1)
				return false;
			if (n % 2 == 0 && n / 2 == 1)
				return true;
			n /= 2;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new D_isPowerOfTwo().isPowerOfTwo(1024));
		System.out.println(new D_isPowerOfTwo().isPowerOfTwo(-128));
	}
}
