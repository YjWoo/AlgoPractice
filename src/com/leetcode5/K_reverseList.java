package com.leetcode5;

public class K_reverseList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// 反转单链表
	public ListNode reverseList(ListNode head) {
		ListNode fakeHead = new ListNode(0);
		ListNode p = head;
		while (p != null) {
			ListNode temp = new ListNode(p.val);
			temp.next = fakeHead.next;
			fakeHead.next = temp;
			p = p.next;
		}

		return fakeHead.next;
	}
}
