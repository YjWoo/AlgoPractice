package com.leetcode3;

public class M_isBalanced {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 是否为平衡二叉树
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		return height(root) != -1;

	}

	public int height(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int lH = height(node.left);
		if (lH == -1) {
			return -1;
		}
		int rH = height(node.right);
		if (rH == -1) {
			return -1;
		}
		if (lH - rH < -1 || lH - rH > 1) {
			return -1;
		}
		return Math.max(lH, rH) + 1;
	}

}
