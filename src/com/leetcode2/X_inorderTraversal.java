package com.leetcode2;

import java.util.ArrayList;
import java.util.List;

public class X_inorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		visit(list, root);
		return list;
	}

	public void visit(List<Integer> list, TreeNode p) {
		if (p == null)
			return;
		visit(list, p.left);
		list.add(p.val);
		visit(list, p.right);
	}
}
