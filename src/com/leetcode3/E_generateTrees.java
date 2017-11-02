package com.leetcode3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E_generateTrees {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 给定数字n，返回所有生成的BST树的列表
	public static List<TreeNode> generateTrees(int n) {
		if (n == 0)
			return new ArrayList<>();
		return genTrees(1, n);
	}

	public static List<TreeNode> genTrees(int start, int end) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		if (start > end) {
			list.add(null);
			return list;
		}
		if (start == end) {
			list.add(new TreeNode(start));
			return list;
		}
		List<TreeNode> left, right;
		for (int i = start; i <= end; i++) {
			left = genTrees(start, i - 1);
			right = genTrees(i + 1, end);
			for (TreeNode lnode : left) {
				for (TreeNode rnode : right) {
					TreeNode root = new TreeNode(i);
					root.left = lnode;
					root.right = rnode;
					list.add(root);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<TreeNode> list = (ArrayList<TreeNode>) generateTrees(5);
		Iterator<TreeNode> it = list.iterator();
		while (it.hasNext()) {
			E_generateTrees.TreeNode treeNode = (E_generateTrees.TreeNode) it.next();
			System.out.print(treeNode.val);
		}
	}
}
