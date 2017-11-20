package com.leetcode3;

public class X_maxPathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int max = Integer.MIN_VALUE;

	// 返回二叉树最大路径(二叉树可看做非有向，任意顺序的路径)
	public int maxPathSum(TreeNode root) {
		helper(root);
		return max;
	}

	int helper(TreeNode root) {
		if (root == null)
			return 0;

		int left = Math.max(helper(root.left), 0);
		int right = Math.max(helper(root.right), 0);

		max = Math.max(max, root.val + left + right);

		return root.val + Math.max(left, right);
	}
}
