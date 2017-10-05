package com.leetcode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H_combinationSum2 {

	// 返回candidates数组内所有加和为target的组合，不允许重复，使用递归
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getResult(result, new ArrayList<>(), candidates, target, 0);
		return result;
	}

	public static void getResult(List<List<Integer>> list, ArrayList<Integer> cur, int[] candidates, int target,
			int start) {
		if (target > 0) {
			for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
				cur.add(candidates[i]);
				getResult(list, cur, candidates, target - candidates[i], i + 1);
				cur.remove(cur.size() - 1);
			}
		} else if (target == 0) {
			if (!list.contains(new ArrayList<>(cur)))
				list.add(new ArrayList<>(cur));
		}
	}

	public static void main(String[] args) {
		int[] array = { 10, 1, 2, 7, 6, 1, 5 };
		System.out.println(combinationSum2(array, 8).toString());
	}
}
