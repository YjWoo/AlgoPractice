package com.leetcode5;

public class W_countNodes {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 给定一个完整的二叉树，计算节点的数量
	public int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		int[] res = new int[1];
		res[0] = 0;
		addNum(res, root);
		return res[0];
	}

	public void addNum(int[] res, TreeNode root) {
		if (root == null)
			return;
		else
			res[0] += 1;
		addNum(res, root.left);
		addNum(res, root.right);
	}

	public int countNodesLessCost(TreeNode root) {

		int leftDepth = leftDepth(root);
		int rightDepth = rightDepth(root);

		if (leftDepth == rightDepth)
			return (1 << leftDepth) - 1;
		else
			return 1 + countNodesLessCost(root.left) + countNodesLessCost(root.right);

	}

	private int rightDepth(TreeNode root) {
		int dep = 0;
		while (root != null) {
			root = root.right;
			dep++;
		}
		return dep;
	}

	private int leftDepth(TreeNode root) {
		int dep = 0;
		while (root != null) {
			root = root.left;
			dep++;
		}
		return dep;
	}
}
