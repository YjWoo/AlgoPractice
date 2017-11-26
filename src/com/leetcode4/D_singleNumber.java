package com.leetcode4;

import java.util.HashMap;

public class D_singleNumber {
	// 在数组内找到单个存在的数字（可以用抑或运算得到）
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int key = -1;
		for (int i = 0; i < nums.length; i++)
			map.put(nums[i], map.get(nums[i]) == null ? 1 : map.get(nums[i]) + 1);
		for (int i : map.keySet())
			if (map.get(i) == 1)
				key = i;
		return key;
	}

	public static void main(String[] args) {
		D_singleNumber solution = new D_singleNumber();
		int[] array1 = { 2, -1, 1, -1, 2, 3, 3, 4, 5, 5, 4 };
		System.out.println(solution.singleNumber(array1));
	}
}
