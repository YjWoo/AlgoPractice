package com.leetcode5;

import java.util.ArrayList;
import java.util.List;

public class E_rightSideView {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 返回二叉树每层最右的节点列表
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		addList(root, res, 0);
		return res;
	}

	public void addList(TreeNode node, List<Integer> list, int depth) {
		if (node == null) {
			return;
		}
		if (depth == list.size()) {
			list.add(node.val);
		}
		addList(node.right, list, depth + 1);
		addList(node.left, list, depth + 1);
	}
}
