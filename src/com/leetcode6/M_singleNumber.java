package com.leetcode6;

import java.util.HashSet;

public class M_singleNumber {
	// 数组所有数字都是存在两次，有两个数存在一次，找出存在一次的数字
	public int[] singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i]))
				set.remove(nums[i]);
			else
				set.add(nums[i]);
		}
		Integer[] arr = (Integer[]) set.toArray();
		int[] res = new int[2];
		res[0] = (int) arr[0];
		res[1] = (int) arr[1];
		return res;
	}
}
