package com.leetcode4;

import java.util.ArrayList;
import java.util.List;

public class E_wordBreak {
	// s能否用wordDict内单词组成，返回布尔值
	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] f = new boolean[s.length() + 1];
		f[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (f[j] && wordDict.contains(s.substring(j, i))) {
					f[i] = true;
					break;
				}
			}
		}
		return f[s.length()];
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("I");
		list.add("miss");
		list.add("you");

		System.out.println(wordBreak("Imissyou", list));
	}
}
