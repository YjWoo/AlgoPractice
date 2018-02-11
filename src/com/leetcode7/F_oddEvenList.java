package com.leetcode7;

public class F_oddEvenList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// 返回奇数在前偶数在后的单链表
	public static ListNode oddEvenList(ListNode head) {
		if (head != null) {
			ListNode odd = head, even = head.next, evenHead = even;
			while (even != null && even.next != null) {
				odd.next = odd.next.next;
				even.next = even.next.next;
				odd = odd.next;
				even = even.next;
			}
			odd.next = evenHead;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode p = head, tmp;
		for (int i = 2; i < 30; i++) {
			tmp = new ListNode(i);
			p.next = tmp;
			p = p.next;
		}
		
		printList(head);
		oddEvenList(head);
		printList(head);
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print(" → ");
			head = head.next;
		}
		System.out.println();
	}
}
