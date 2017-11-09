package com.leetcode3;

public class K_sortedArrayToBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 有序数组转为BST树
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0)
			return null;
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] nums, int l, int r) {
		if (l >= r)
			return null;
		int mid = (l + r) / 2;
		TreeNode p = new TreeNode(nums[mid]);
		p.left = sortedArrayToBST(nums, l, mid - 1);
		p.right = sortedArrayToBST(nums, mid + 1, r);
		return p;
	}
}
