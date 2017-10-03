package com.leetcode1;

public class E_searchInsert {
	// 给定递增排序数组，返回插入下标
	public int searchInsert(int[] nums, int target) {
		if (nums.length == 1 && target > nums[0])
			return 1;
		for (int i = 1; i < nums.length; i++) {
			if (target >= nums[i - 1] && target < nums[i])
				return i;
			else if (i == nums.length - 1 && target >= nums[i]) {
				return i + 1;
			}
		}
		return 0;
	}
}
