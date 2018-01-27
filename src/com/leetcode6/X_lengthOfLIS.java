package com.leetcode6;

public class X_lengthOfLIS {
	// 返回数组内按序能构成的递增子序列的最大长度，DP解法
	public int lengthOfLIS(int[] nums) {
		int[] tails = new int[nums.length];
		int size = 0;
		for (int x : nums) {
			int i = 0, j = size;
			while (i != j) {
				int m = (i + j) / 2;
				if (tails[m] < x)
					i = m + 1;
				else
					j = m;
			}
			tails[i] = x;
			if (i == size)
				++size;
		}
		return size;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 67, 43, 213, 324, 6, 43, 123, 12, 4, 23 };
		System.out.println(new X_lengthOfLIS().lengthOfLIS(array));
	}
}
