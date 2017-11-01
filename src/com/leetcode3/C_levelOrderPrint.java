package com.leetcode3;

import java.util.ArrayList;
import java.util.List;

public class C_levelOrderPrint {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 层次遍历二叉树，并打印每一层的值
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		int n = 1, k = 0;
		if (root == null)
			return result;
		ArrayList<TreeNode> queue = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode p = queue.remove(0);
			if (p != null) {
				list.add(p.val);
				queue.add(p.left);
				queue.add(p.right);
				k++;
			} else
				n--;
			if (k == n) {
				k = 0;
				n *= 2;
				if (!list.isEmpty())
					result.add(list);
				list = new ArrayList<>();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t4.right = t5;

		System.out.println(levelOrder(t1));
	}
}
