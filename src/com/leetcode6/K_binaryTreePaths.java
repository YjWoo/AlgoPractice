package com.leetcode6;

import java.util.ArrayList;
import java.util.List;

public class K_binaryTreePaths {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		addList(root, res, new ArrayList<>());
		return res;
	}

	public void addList(TreeNode root, List<String> list, List<Integer> order) {
		if (root != null)
			order.add(root.val);
		else
			return;
		if (root.left == null && root.right == null) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < order.size(); i++) {
				sb.append(order.get(i));
				if (i != order.size() - 1)
					sb.append("->");
			}
			list.add(sb.toString());
		}
		addList(root.left, list, order);
		addList(root.right, list, order);
		order.remove(order.size() - 1);
	}
}
