package com.leetcode4;

import java.util.HashMap;

public class U_majorityElement {
	// 返回数组内出现最多次数的值，至少要出现数组长度的一半
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (!hashMap.containsKey(nums[i]))
				hashMap.put(nums[i], 1);
			else
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);

		}
		for (int i : hashMap.keySet())
			if (hashMap.get(i) > n / 2)
				return i;
		return 0;
	}
}
