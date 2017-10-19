package com.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_subsets {
	// 打印nums数组内所有数据可能出现的排列组合
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		addList(res, new ArrayList<>(), nums, 0);
		return res;
	}

	public static void addList(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int start) {
		res.add(new ArrayList<>(list));
		for (int i = start; i < nums.length; i++) {
			list.add(nums[i]);
			addList(res, list, nums, i + 1);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		System.out.println(subsets(array));
	}
}
