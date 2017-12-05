package com.leetcode4;

public class P_getIntersectionNode {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	// 返回两个链表的交点，不存在返回null(利用长度差值)
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode p = headA, q = headB;
		while (p != null && q != null) {
			p = p.next;
			q = q.next;
		}
		if (p != null) {
			while (p != null) {
				p = p.next;
				headA = headA.next;
			}
		} else if (q != null) {
			while (q != null) {
				q = q.next;
				headB = headB.next;
			}
		}
		while (headA != null && headB != null) {
			if (headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	//另一种巧妙解法，无需计算长度差
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode a = headA;
		ListNode b = headB;

		while (a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}

		return a;
	}
}
