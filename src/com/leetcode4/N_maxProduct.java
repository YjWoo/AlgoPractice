package com.leetcode4;

public class N_maxProduct {
	// 求数组内连续值乘积的最大值，DP解法
	public int maxProduct2(int[] nums) {
		int result = Integer.MIN_VALUE;
		int[][] matrix = new int[nums.length][nums.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j)
					matrix[i][j] = nums[i];
				else
					matrix[i][j] = matrix[i - 1][j] * nums[i];
				result = Math.max(result, matrix[i][j]);
			}
		}
		return result;
	}

	// 时间复杂度、空间复杂度更低
	public int maxProduct(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int maxherepre = nums[0];
		int minherepre = nums[0];
		int maxsofar = nums[0];
		int maxhere, minhere;
		for (int i = 1; i < nums.length; i++) {
			maxhere = Math.max(Math.max(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
			minhere = Math.min(Math.min(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
			maxsofar = Math.max(maxhere, maxsofar);
			maxherepre = maxhere;
			minherepre = minhere;
		}
		return maxsofar;
	}

	public static void main(String[] args) {
		System.out.println(new N_maxProduct().maxProduct(new int[] { 2, 3, -2, 4, 5, 3, 2, -3, -3 }));
	}
}
