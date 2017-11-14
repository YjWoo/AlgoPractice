package com.leetcode3;

public class O_hasPathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	//判定一颗二叉树是否存在一条路径加和等于sum的路径
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		int val = sum - root.val;
		if (val == 0 && root.left == null && root.right == null)
			return true;
		return hasPathSum(root.left, val) || hasPathSum(root.right, val);
	}
}
