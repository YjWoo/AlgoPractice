package com.leetcode6;

public class J_isAnagram {
	// 判断两个单词组成元素是否相同
	public boolean isAnagram(String s, String t) {
		int[] sarr = new int[26];
		int[] tarr = new int[26];
		for (int i = 0; i < s.length(); i++)
			sarr[s.charAt(i) - 'a'] += 1;
		for (int i = 0; i < t.length(); i++)
			tarr[t.charAt(i) - 'a'] += 1;
		for (int i = 0; i < tarr.length; i++)
			if (tarr[i] != sarr[i])
				return false;
		return true;
	}
}
