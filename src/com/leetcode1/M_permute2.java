package com.leetcode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_permute2 {
	// 根据传入数组生成不同次序的数字组合，数组内允许有重复值
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0)
			return res;
		boolean[] used = new boolean[nums.length];
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		dfs(nums, used, list, res);
		return res;
	}

	public static void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res) {
		if (list.size() == nums.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;
			if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1])
				continue;
			used[i] = true;
			list.add(nums[i]);
			dfs(nums, used, list, res);
			used[i] = false;
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 1 };

		System.out.println(permuteUnique(array1));
	}
}
