package com.leetcode2;

import java.util.ArrayList;

public class Z_isValidBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 判断是否为二叉搜索树
	public boolean isValidBST(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		inOrder(root, list);
		for (int i = 0; i < list.size() - 1; i++)
			if (list.get(i) >= list.get(i + 1))
				return false;
		return true;
	}

	public void inOrder(TreeNode root, ArrayList<Integer> list) {
		if (root == null)
			return;
		inOrder(root.left, list);
		list.add(root.val);
		inOrder(root.right, list);
	}
	
	//另一种解法
	public boolean isValidBSTAnother(TreeNode root) {
		return isValidBSTAnother(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public boolean isValidBSTAnother(TreeNode root, long minVal, long maxVal) {
		if (root == null)
			return true;
		if (root.val >= maxVal || root.val <= minVal)
			return false;
		return isValidBSTAnother(root.left, minVal, root.val) && isValidBSTAnother(root.right, root.val, maxVal);
	}
}
