package com.leetcode5;

import java.util.Stack;

public class Z_calculate {
	
	// 字符串s为表达式，返回结果
	public int calculate(String s) {
		int len;
		if (s == null || (len = s.length()) == 0)
			return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int num = 0;
		char sign = '+';
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(s.charAt(i))) {
				num = num * 10 + s.charAt(i) - '0';
			}
			if ((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i)) || i == len - 1) {
				if (sign == '-') {
					stack.push(-num);
				}
				if (sign == '+') {
					stack.push(num);
				}
				if (sign == '*') {
					stack.push(stack.pop() * num);
				}
				if (sign == '/') {
					stack.push(stack.pop() / num);
				}
				sign = s.charAt(i);
				num = 0;
			}
		}

		int res = 0;
		for (int i : stack) {
			res += i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(new Z_calculate().calculate("3*2-34*1-35+151+555/4"));
	}
}
