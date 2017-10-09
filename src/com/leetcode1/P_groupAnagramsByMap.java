package com.leetcode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_groupAnagramsByMap {
	
	//通过HashMap实现 将含有相同字符的字符串重组，时间复杂度低
	public static List<List<String>> groupAnagramsByMap(String[] strs) {
		if (strs == null || strs.length == 0)
			return new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String keyStr = String.valueOf(ca);
			if (!map.containsKey(keyStr))
				map.put(keyStr, new ArrayList<String>());
			map.get(keyStr).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		String[] strings = { "tan", "ant", "stop", "time", "mean", "ate", "eat", "tea" };

		System.out.println(groupAnagramsByMap(strings));
	}
}
