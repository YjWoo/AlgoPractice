package com.leetcode3;

import java.util.HashMap;

public class Z_longestConsecutive {
	// 返回数组内最长的连续子数组长度
	public static int longestConsecutive(int[] nums) {
		int res = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			if (!map.containsKey(n)) {
				int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
				int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
				int sum = left + right + 1;
				map.put(n, sum);
				res = Math.max(res, sum);
				map.put(n - left, sum);
				map.put(n + right, sum);
			} else {
				continue;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 67, 43, 213, 324, 6, 5, 43, 123, 12, 4, 23 };
		//1 2 3 4 5 6
		System.out.println(longestConsecutive(array));
	}
}
