package com.leetcode4;

public class M_reverseWords {

	// 字符串空格分割单词，反转字符串内的字符顺序
	public String reverseWords(String s) {
		String[] strings = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = strings.length - 1; i >= 0; i--) {
			if (!strings[i].equals("")) {
				sb.append(strings[i]);
				if (i != 0)
					sb.append(" ");
			} else
				continue;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new M_reverseWords().reverseWords(" abc              efg"));
	}
}
