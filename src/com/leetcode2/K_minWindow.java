package com.leetcode2;

import java.util.ArrayList;

public class K_minWindow {
	// 返回s中含有t内所有字符的最小子串
	public static String minWindow(String s, String t) {
		char[] source = s.toCharArray();

		ArrayList<Character> elements = new ArrayList<>();
		for (int i = 0; i < t.length(); i++)
			elements.add(t.charAt(i));

		ArrayList<Integer> pos = new ArrayList<>();
		for (int i = 0; i < source.length; i++)
			if (elements.contains(source[i]))
				pos.add(i);
		if (pos.isEmpty())
			return "";

		StringBuilder result = new StringBuilder();
		while (!pos.isEmpty()) {
			int n = pos.remove(0);
			ArrayList<Character> list = new ArrayList<>();
			list.addAll(elements);
			StringBuilder sb = new StringBuilder();
			for (int i = n; i < source.length; i++) {
				if (list.isEmpty())
					break;
				sb.append(source[i]);
				if (list.contains(source[i]))
					list.remove((Object) source[i]);
			}
			if (!list.isEmpty())
				continue;
			System.out.print(sb.toString() + " ");
			if (result.length() == 0)
				result = sb;
			else {
				if (result.length() > sb.length())
					result = sb;
			}
		}
		System.out.println();
		return result.toString();
	}
	
	//简化版，时间复杂度O(n)
	public String minWindowNeat(String S, String T) {
		if (S == null || S.isEmpty() || T == null || T.isEmpty())
			return "";
		int i = 0, j = 0;
		//下标代表对应字符，Clever Idea
		int[] Tmap = new int[256];
		int[] Smap = new int[256];
		for (int k = 0; k < T.length(); k++) {
			Tmap[T.charAt(k)]++;
		}
		int found = 0;
		int length = Integer.MAX_VALUE;
		String res = "";
		while (j < S.length()) {
			if (found < T.length()) {
				if (Tmap[S.charAt(j)] > 0) {
					Smap[S.charAt(j)]++;
					if (Smap[S.charAt(j)] <= Tmap[S.charAt(j)]) {
						found++;
					}
				}
				j++;
			}
			while (found == T.length()) {
				if (j - i < length) {
					length = j - i;
					res = S.substring(i, j);
				}
				if (Tmap[S.charAt(i)] > 0) {
					Smap[S.charAt(i)]--;
					if (Smap[S.charAt(i)] < Tmap[S.charAt(i)]) {
						found--;
					}
				}
				i++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String S = "ADOBECODEBANC";
		String T = "ABC";
		System.out.println(minWindow(S, T));
	}
}
