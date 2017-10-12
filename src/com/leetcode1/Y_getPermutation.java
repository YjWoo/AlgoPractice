package com.leetcode1;

import java.util.LinkedList;
import java.util.List;

public class Y_getPermutation {
	// 获取由1~n组成的的全排列递归数组中第k个数的值，利用迭代、阶乘可求出，使用回溯法时间复杂度过高
	public static String getPermutation(int n, int k) {
		List<Integer> num = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++)
			num.add(i);
		int[] fact = new int[n]; // factorial
		fact[0] = 1;
		for (int i = 1; i < n; i++)
			fact[i] = i * fact[i - 1];
		k--;
		StringBuilder sb = new StringBuilder();
		for (int i = n; i > 0; i--) {
			int ind = k / fact[i - 1];
			k = k % fact[i - 1];
			sb.append(num.get(ind));
			num.remove(ind);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(getPermutation(6, 7));
	}
}
