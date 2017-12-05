package com.leetcode4;

public class O_findMin {
	// 查找旋转数组中最小元素
	public int findMin(int[] nums) {
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				min = nums[i];
				break;
			}
		}
		return min;
	}

}
