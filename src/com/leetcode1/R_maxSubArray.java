package com.leetcode1;

public class R_maxSubArray {
	// 返回子数组加和最大值，时间复杂度O(n)
	public static int maxSubArray(int[] nums) {
		int max = nums[0], maxCur = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxCur = Math.max(maxCur + nums[i], nums[i]);
			max = Math.max(max, maxCur);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array1 = { -2, -1, 1, -1, 2 };
		System.out.println(maxSubArray(array1));
	}
}
