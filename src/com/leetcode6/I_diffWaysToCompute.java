package com.leetcode6;

import java.util.ArrayList;
import java.util.List;

public class I_diffWaysToCompute {
	// 返回输入字符串的'+''-''*'运算任意组合的结果集合
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '-' || c == '+' || c == '*') {
				String a = input.substring(0, i);
				String b = input.substring(i + 1);
				List<Integer> al = diffWaysToCompute(a);
				List<Integer> bl = diffWaysToCompute(b);
				for (int x : al) {
					for (int y : bl) {
						if (c == '-') {
							res.add(x - y);
						} else if (c == '+') {
							res.add(x + y);
						} else if (c == '*') {
							res.add(x * y);
						}
					}
				}
			}
		}
		if (res.size() == 0)
			res.add(Integer.valueOf(input));
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new I_diffWaysToCompute().diffWaysToCompute("1+2*3-4"));
	}
}
