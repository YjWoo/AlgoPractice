package com.leetcode6;

public class O_missingNumber {

	// 寻找[1~n]的数组内缺失的数字
	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		return (nums.length * (nums.length + 1)) / 2 - sum;
	}
	//抑或方式
	public int missingNumberXOR(int[] nums) {
		int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}
		return xor ^ i;
	}
}
