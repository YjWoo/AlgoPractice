package com.leetcode4;

public class G_detectCycle {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	// 判断是否为循环链表，返回循环入口
	public static ListNode detectCycle(ListNode head) {
		if (head == null)
			return null;
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				ListNode p = head;
				while (p != slow) {
					p = p.next;
					slow = slow.next;
				}
				return p;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l3;

		System.out.println(detectCycle(l1).val);
	}
}
