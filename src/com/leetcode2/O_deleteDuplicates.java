package com.leetcode2;

public class O_deleteDuplicates {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// 单递增链表删除重复节点（删除重复节点本身）
	public ListNode deleteDuplicatesInclude(ListNode head) {
		if (head == null)
			return null;

		if (head.next != null && head.val == head.next.val) {
			while (head.next != null && head.val == head.next.val) {
				head = head.next;
			}
			return deleteDuplicates(head.next);
		} else {
			head.next = deleteDuplicates(head.next);
		}
		return head;
	}
	// 单递增链表删除多余重复节点
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = head;
		while (p != null) {
			ListNode q = p;
			while (q.next != null && q.next.val == q.val)
				q = q.next;
			p.next = q.next;
			p = q.next;
		}
		return head;
	}

}
