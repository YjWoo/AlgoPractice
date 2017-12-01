package com.leetcode4;

public class J_insertionSortList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// 使用直接插入排序的方式将链表排序
	public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode tofirst = new ListNode(0);
		ListNode cur = head;
		ListNode pre = tofirst;
		ListNode next = null;
		while (cur != null) {
			next = cur.next;
			while (pre.next != null && pre.next.val < cur.val) {
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			pre = tofirst;
			cur = next;
		}
		return tofirst.next;
	}
}
