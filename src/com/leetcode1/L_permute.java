package com.leetcode1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L_permute {
	// 根据传入数组生成不同次序的数字组合
	public static List<List<Integer>> permute(int[] nums) {
		LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		for (int n : nums) {
			int size = res.size();
			for (; size > 0; size--) {
				List<Integer> r = res.pollFirst();
				for (int i = 0; i <= r.size(); i++) {
					List<Integer> t = new ArrayList<Integer>(r);
					t.add(i, n);
					res.add(t);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] array1 = { 5, 4, 1,7,12,17};

		System.out.println(permute(array1));
	}
}
