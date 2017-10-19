package com.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class L_combineList {
	// 返回1~n中所有长度为k的列表，回溯法
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<>();
		addList(res, new ArrayList<>(), 1, n, k);
		return res;
	}

	public static void addList(List<List<Integer>> res, List<Integer> list, int start, int n, int k) {
		if (k == 0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = start; i <= n; i++) {
			list.add(i);
			addList(res, list, i + 1, n, k - 1);
			list.remove(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(combine(10, 3));
	}
}
