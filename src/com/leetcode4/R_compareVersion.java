package com.leetcode4;

public class R_compareVersion {
	//比较版本号
	public int compareVersion(String version1, String version2) {
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		int length = s1.length > s2.length ? s2.length : s1.length;
		int i;
		for (i = 0; i < length; i++) {
			int v1 = Integer.parseInt(s1[i]);
			int v2 = Integer.parseInt(s2[i]);
			if (v1 < v2)
				return -1;
			else if (v1 > v2)
				return 1;
		}
		if (s1.length > s2.length) {
			for (; i < s1.length; i++) {
				if (Integer.parseInt(s1[i]) != 0)
					return 1;
			}
		}
		if (s1.length < s2.length) {
			for (; i < s2.length; i++) {
				if (Integer.parseInt(s2[i]) != 0)
					return -1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(new R_compareVersion().compareVersion("3.46.4", "2.57.2.1"));
	}
}
