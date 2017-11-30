package com.leetcode4;

import java.util.ArrayList;
import java.util.List;

public class I_preorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		addList(root, list);
		return list;
	}

	public void addList(TreeNode root, ArrayList<Integer> list) {
		if (root == null)
			return;
		list.add(root.val);
		addList(root.left, list);
		addList(root.right, list);
	}
}
