package com.leetcode5;

public class Y_invertTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 反转二叉树
	public TreeNode invertTree(TreeNode root) {
		invert(root);
		return root;
	}

	public void invert(TreeNode root) {
		if (root == null)
			return;
		TreeNode temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		invert(root.left);
		invert(root.right);
	}
}
