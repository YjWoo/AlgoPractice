package com.leetcode1;

import java.util.ArrayList;
import java.util.List;

public class O_groupAnagramsByList {
	// 将所有含相同字符的字符串组合到一起，仅使用list，时间复杂度很高
	public static List<List<String>> groupAnagramsByList(String[] strs) {
		List<List<String>> result = new ArrayList<>();

		for (int i = 0; i < strs.length; i++) {
			ArrayList<String> list = new ArrayList<>();
			String s = strs[i];
			list.add(s);
			for (int j = i + 1; j < strs.length; j++) {
				if (match(list, s, strs[j])) {
					i++;
					String temp = strs[j];
					strs[j] = strs[i];
					strs[i] = temp;
				}

			}
			result.add(list);
		}
		return result;
	}

	public static boolean match(ArrayList<String> list, String s, String cur) {
		if (s.length() != cur.length())
			return false;
		ArrayList<Character> characters = new ArrayList<>();
		for (int i = 0; i < s.length(); i++)
			characters.add(s.charAt(i));
		for (int i = 0; i < cur.length(); i++)
			if (characters.contains(cur.charAt(i)))
				characters.remove((Object) cur.charAt(i));
			else
				return false;
		list.add(cur);
		return true;
	}

	public static void main(String[] args) {
		String[] strings = { "tan", "ant", "stop", "time", "mean", "ate", "eat", "tea" };

		System.out.println(groupAnagramsByList(strings));
	}
}
