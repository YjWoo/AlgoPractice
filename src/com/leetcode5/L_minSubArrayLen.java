package com.leetcode5;

public class L_minSubArrayLen {
	// 返回所有子串的和大于s的最小长度，没有返回0
	public int minSubArrayLen(int s, int[] nums) {
		int minLen = Integer.MAX_VALUE;
		int curLen, curValue;
		for (int i = 0; i < nums.length; i++) {
			curLen = 1;
			curValue = nums[i];
			if (curValue >= s)
				minLen = 1;
			for (int j = i + 1; j < nums.length; j++) {
				curValue += nums[j];
				curLen++;
				if (curValue >= s) {
					minLen = Math.min(minLen, curLen);
					break;
				}
			}
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 67, 43, 213, 6, 43, 123, 43, 324, 12, 4, 23 };
		System.out.println(new L_minSubArrayLen().minSubArrayLen(400, array));
	}
}
