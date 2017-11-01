package com.leetcode3;

public class B_isSymmetricTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmetricCompare(root.left, root.right);
	}

	public boolean isSymmetricCompare(TreeNode lt, TreeNode rt) {
		if (lt == null || rt == null)
			return lt == rt;
		if (lt.val != rt.val)
			return false;
		return isSymmetricCompare(lt.right, rt.left) && isSymmetricCompare(lt.left, rt.right);
	}

}
