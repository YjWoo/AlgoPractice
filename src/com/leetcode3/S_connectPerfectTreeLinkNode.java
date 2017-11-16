package com.leetcode3;

import java.util.ArrayList;

public class S_connectPerfectTreeLinkNode {
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	// 层次遍历完全二叉树，每个树节点的next指针指向本层下一个节点，每层最后一个节点指向空
	public void connect(TreeLinkNode root) {
		ArrayList<TreeLinkNode> queue = new ArrayList<>();
		ArrayList<TreeLinkNode> list = new ArrayList<>();
		if (root == null)
			return;
		queue.add(root);
		TreeLinkNode p;
		while (!queue.isEmpty()) {
			p = queue.remove(0);
			if (p != null) {
				list.add(p);
				queue.add(p.left);
				queue.add(p.right);
			}
		}
		int level = 1, num = 0;
		for (int i = 0; i < list.size(); i++) {
			p = list.get(i);
			num++;
			if (num == level) {
				p.next = null;
				level *= 2;
				num = 0;
				continue;
			}
			if (i + 1 == list.size()) {
				p.next = null;
				return;
			}
			p.next = list.get(i + 1);
		}
	}
	
	//简单解法，时间复杂度O(n)，空间复杂度O(1)……………………(T_T)忧伤脸………………
	public void connectSimple(TreeLinkNode root) {
		TreeLinkNode level_start = root;
		while (level_start != null) {
			TreeLinkNode cur = level_start;
			while (cur != null) {
				if (cur.left != null)
					cur.left.next = cur.right;
				if (cur.right != null && cur.next != null)
					cur.right.next = cur.next.left;

				cur = cur.next;
			}
			level_start = level_start.left;
		}
	}
}
