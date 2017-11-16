package com.leetcode3;

public class T_connectAnyTreeLinkNode {
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	// 层次遍历任意二叉树，每个树节点的next指针指向本层下一个节点，每层最后一个节点指向空
	public void connect(TreeLinkNode root) {
		while (root != null) {
			TreeLinkNode tempChild = new TreeLinkNode(0);
			TreeLinkNode currentChild = tempChild;
			while (root != null) {
				if (root.left != null) {
					currentChild.next = root.left;
					currentChild = currentChild.next;
				}
				if (root.right != null) {
					currentChild.next = root.right;
					currentChild = currentChild.next;
				}
				root = root.next;
			}
			root = tempChild.next;
		}
	}
}
