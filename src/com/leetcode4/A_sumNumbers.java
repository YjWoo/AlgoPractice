package com.leetcode4;

public class A_sumNumbers {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int sum = 0;
	//二叉树节点值为0~9，根据root-leaf路径的一串数字作为路径值，返回所有路径值加和
	public int sumNumbers(TreeNode root) {
		addNumber(root, 0);
		return sum;
	}

	public void addNumber(TreeNode root, int num) {
		if (root == null)
			return;
		num = num * 10 + root.val;
		if (root.left == null && root.right == null) {
			sum += num;
			return;
		}
		addNumber(root.left, num);
		addNumber(root.right, num);
	}
}
