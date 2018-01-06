package com.leetcode6;

import java.util.ArrayList;

public class C_kthSmallest {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 返回BST中第k小的值
	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		kthNode(root, res);
		return res.get(k);
	}

	public void kthNode(TreeNode root, ArrayList<Integer> res) {
		if (root == null)
			return;
		kthNode(root.left, res);
		res.add(root.val);
		kthNode(root.right, res);
	}
}
