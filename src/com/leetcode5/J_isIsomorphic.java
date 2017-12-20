package com.leetcode5;

import java.util.HashMap;

public class J_isIsomorphic {
	// 判断两个字符串是否为相同结构，如title与paper
	public boolean isIsomorphic(String s, String t) {
		if (s == null || s.length() <= 1)
			return true;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (map.containsKey(a)) {
				if (map.get(a).equals(b))
					continue;
				else
					return false;
			} else {
				if (!map.containsValue(b))
					map.put(a, b);
				else
					return false;
			}
		}
		return true;
	}
}
