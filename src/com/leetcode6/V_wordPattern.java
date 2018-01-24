package com.leetcode6;

import java.util.HashMap;

public class V_wordPattern {
	// String按照空格分割，要符合pattern的格式，返回布尔值
	public boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map1 = new HashMap<>();
		HashMap<String, Character> map2 = new HashMap<>();
		String[] strlist = str.split(" ");
		char[] patternlist = pattern.toCharArray();
		if (strlist.length != patternlist.length)
			return false;
		for (int i = 0; i < patternlist.length; i++) {
			char c = patternlist[i];
			String s = strlist[i];
			if (!map1.containsKey(c) && !map2.containsKey(s)) {
				map1.put(c, s);
				map2.put(s, c);
			} else if (map1.containsKey(c) && !map1.get(c).equals(s)) {
				return false;
			} else if (map2.containsKey(s) && !map2.get(s).equals(c))
				return false;
			else
				continue;
		}
		return true;
	}
}
