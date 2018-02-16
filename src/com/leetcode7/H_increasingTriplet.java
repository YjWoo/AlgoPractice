package com.leetcode7;

public class H_increasingTriplet {
	// 给定一个未排序的数组，返回数组中是否存在长度增加的子序列
	public boolean increasingTriplet(int[] nums) {
		int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
		for (int n : nums) {
			if (n <= small) {
				small = n;
			} else if (n <= big) {
				big = n;
			} else
				return true;
		}
		return false;
	}
}
