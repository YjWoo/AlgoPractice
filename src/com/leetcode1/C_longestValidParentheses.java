package com.leetcode1;

import java.util.Stack;

public class C_longestValidParentheses {
	// 返最长有效括号的最长值，"()()()"返回6，"()(()"返回2
	public static int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		int max = 0, left = -1;
		char[] chars = s.toCharArray();
		if (chars.length < 2)
			return 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(')
				stack.push(i);
			else {
				if (stack.isEmpty())
					left = i;
				else {
					stack.pop();
					if (stack.isEmpty())
						max = Math.max(max, i - left);
					else
						max = Math.max(max, i - stack.peek());
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")))())()"));
	}
}
