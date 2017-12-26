package com.leetcode5;

import java.util.ArrayList;
import java.util.List;

public class Q_combinationSum3 {
	// 返回所有包含k个数字的组合且加和等于n的list，无重复值
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new ArrayList<>();
		addList(k, 1, n, res, new ArrayList<Integer>());
		return res;
	}

	private void addList(int k, int start, int n, List<List<Integer>> res, List<Integer> list) {
		if (list.size() == k && n == 0) {
			List<Integer> li = new ArrayList<Integer>(list);
			res.add(li);
			return;
		}
		for (int i = start; i <= 9; i++) {
			list.add(i);
			addList(k, i + 1, n - i, res, list);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Q_combinationSum3().combinationSum3(4, 20));
	}
}
