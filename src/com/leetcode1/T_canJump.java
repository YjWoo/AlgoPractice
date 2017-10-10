package com.leetcode1;

public class T_canJump {
	// 给定非负整数数组，从第一个下标开始，对应值为步数，返回是否能够抵达最后一位
	public static boolean canJump(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > max) {
				return false;
			}
			max = Math.max(nums[i] + i, max);
		}
		return true;
	}

	public static void main(String[] args) {

		int[] array = { 2, 3, 1, 1, 4 };
		int[] array2 = { 3, 2, 1, 0, 4 };
		System.out.println(canJump(array));
		System.out.println(canJump(array2));
	}
}
