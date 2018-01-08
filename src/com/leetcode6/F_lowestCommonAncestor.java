package com.leetcode6;

public class F_lowestCommonAncestor {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// BST树内返回p、q的最近祖先节点
	public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestorBST(root.left, p, q);
		} else if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestorBST(root.right, p, q);
		} else {
			return root;
		}
	}
	
	//条件改为普通二叉树
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null)
			return root;
		return left != null ? left : right;
	}
}
