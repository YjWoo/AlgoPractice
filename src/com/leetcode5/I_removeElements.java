package com.leetcode5;

public class I_removeElements {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	//删除单链表所有val值
	public ListNode removeElements(ListNode head, int val) {
		ListNode p = new ListNode(0);
		p.next = head;
		ListNode q = p;
		while (q != null) {
			while (q.next != null && q.next.val == val)
				q.next = q.next.next;
			q = q.next;
		}
		return p.next;
	}

}
