package com.leetcode4;

import java.util.ArrayList;
import java.util.Stack;

public class L_evalRPN {
	// 给定字符串列表，仿照二叉树后序遍历，返回计算结果
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		int num1, num2;
		for (String s : tokens) {
			if (s.equals("+")) {
				num2 = stack.pop();
				num1 = stack.pop();
				stack.push(num1 + num2);
			} else if (s.equals("-")) {
				num2 = stack.pop();
				num1 = stack.pop();
				stack.push(num1 - num2);
			} else if (s.equals("*")) {
				num2 = stack.pop();
				num1 = stack.pop();
				stack.push(num1 * num2);
			} else if (s.equals("/")) {
				num2 = stack.pop();
				num1 = stack.pop();
				stack.push(num1 / num2);
			} else {
				stack.push(Integer.valueOf(s));
			}
		}
		return stack.peek();
	}

	// 时间复杂度高，舍弃
	public int evalRPN1(String[] tokens) {
		int num;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < tokens.length; i++)
			list.add(tokens[i]);
		while (list.size() != 1) {
			for (int i = 0; i < list.size(); i++) {
				switch (list.get(i)) {
				case "+":
					num = Integer.valueOf(list.get(i - 2)) + Integer.valueOf(list.get(i - 1));
					list.set(i, String.valueOf(num));
					list.remove(i - 2);
					list.remove(i - 2);
					i = 0;
					break;
				case "-":
					num = Integer.valueOf(list.get(i - 2)) - Integer.valueOf(list.get(i - 1));
					list.set(i, String.valueOf(num));
					list.remove(i - 2);
					list.remove(i - 2);
					i = 0;
					break;
				case "*":
					num = Integer.valueOf(list.get(i - 2)) * Integer.valueOf(list.get(i - 1));
					list.set(i, String.valueOf(num));
					list.remove(i - 2);
					list.remove(i - 2);
					i = 0;
					break;
				case "/":
					num = Integer.valueOf(list.get(i - 2)) / Integer.valueOf(list.get(i - 1));
					list.set(i, String.valueOf(num));
					list.remove(i - 2);
					list.remove(i - 2);
					i = 0;
					break;
				default:
					continue;
				}
			}
		}
		return Integer.valueOf(list.get(0));
	}

	public static void main(String[] args) {
		String[] nums = { "21", "2", "+", "20", "-", "3", "*" };

		System.out.println(evalRPN(nums));
	}
}
