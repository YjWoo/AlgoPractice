package com.leetcode7;

public class C_maxProduct {
	// 返回words内字母组成完全不同的两个单词的长度乘积(利用与、或运算)
	public int maxProduct(String[] words) {
		if (words == null || words.length == 0)
			return 0;
		int len = words.length;
		int[] value = new int[len];
		for (int i = 0; i < len; i++) {
			String tmp = words[i];
			value[i] = 0;
			for (int j = 0; j < tmp.length(); j++) {
				value[i] |= 1 << (tmp.charAt(j) - 'a');
			}
		}
		int maxProduct = 0;
		for (int i = 0; i < len; i++)
			for (int j = i + 1; j < len; j++) {
				if ((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct))
					maxProduct = words[i].length() * words[j].length();
			}
		return maxProduct;
	}

	public static void main(String[] args) {
		String[] strings = { "bang", "ant", "stop", "time", "mean", "ate", "eat", "tea", "quote" };

		System.out.println(new C_maxProduct().maxProduct(strings));
	}
}
