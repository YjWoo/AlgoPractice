package com.leetcode3;

import java.util.ArrayList;
import java.util.List;

public class P_pathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	//打印所有路径和为sum的路径
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<>();
		addPath(root, sum, res, new ArrayList<>());
		return res;
	}

	public void addPath(TreeNode root, int sum, List<List<Integer>> res, ArrayList<Integer> path) {
		if (root == null)
			return;
		path.add(new Integer(root.val));
		if (root.left == null && root.right == null && sum == root.val) {
			res.add(new ArrayList<>(path));
			path.remove(path.size() - 1);
			return;
		} else {
			addPath(root.left, sum - root.val, res, path);
			addPath(root.right, sum - root.val, res, path);
		}
		path.remove(path.size() - 1);
	}
}
