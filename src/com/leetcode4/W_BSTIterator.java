package com.leetcode4;

import java.util.ArrayList;

public class W_BSTIterator {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	//创建一个BST数据结构，实现迭代器功能
	public class BSTIterator {
		/**
		 * Your BSTIterator will be called like this: BSTIterator i = new
		 * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
		 */
		ArrayList<Integer> list;

		public BSTIterator(TreeNode root) {
			list = new ArrayList<>();
			addList(list, root);
		}

		private void addList(ArrayList<Integer> list, TreeNode root) {
			if (root == null)
				return;
			addList(list, root.left);
			list.add(root.val);
			addList(list, root.right);
		}

		/** @return whether we have a next smallest number */
		public boolean hasNext() {
			if (list.isEmpty())
				return false;
			return true;
		}

		/** @return the next smallest number */
		public int next() {
			return list.remove(0);
		}
	}
}
