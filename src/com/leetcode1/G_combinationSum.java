package com.leetcode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G_combinationSum {
	
	// 返回candidates数组内所有加和为target的组合，允许重复，使用递归
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);

		return result;
	}

	private static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target,
			int start) {
		if (target > 0) {
			for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
				cur.add(candidates[i]);
				getResult(result, cur, candidates, target - candidates[i], i);
				cur.remove(cur.size() - 1);
			}
		} else if (target == 0) {
			result.add(new ArrayList<Integer>(cur));
		}
	}

	public static void main(String[] args) {
		int[] array={2,4,3,12,5,7};
		System.out.println(combinationSum(array, 20).toString());
	}
}
