package com.leetcode1;

public class D_searchRange {
	// 返回非递减数组target值的范围，没有则返回（-1，-1）
	public static int[] searchRange(int[] nums, int target) {
		if (nums.length == 1 && target == nums[0])
			return new int[] { 0, 0 };
		int m = -1, n = -1;
		int i = 0;
		int j = nums.length - 1;
		while (i < nums.length) {
			if (nums[i] == target) {
				m = i;
				break;
			}
			i++;
		}
		while (j >= 0) {
			if (nums[j] == target) {
				n = j;
				break;
			}
			j--;
		}
		return new int[] { m, n };
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 4, 6 };

		System.out.println(searchRange(array, 3)[0] + " " + searchRange(array, 3)[1]);
	}
}
