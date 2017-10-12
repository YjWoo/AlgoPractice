package com.leetcode1;

public class Z_rotateRight {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// Given a list, rotate the list to the right by k places, where k is
	// non-negative.
	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy, slow = dummy;

		int i;
		for (i = 0; fast.next != null; i++)// Get the total length
			fast = fast.next;

		for (int j = i - k % i; j > 0; j--) // Get the i-n%i th node
			slow = slow.next;

		fast.next = dummy.next; // Do the rotation
		dummy.next = slow.next;
		slow.next = null;

		return dummy.next;
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

		ListNode p = l1;
		while (p != null) {
			System.out.print(p.val + " → ");
			p = p.next;
		}
		System.out.println();
		System.out.println("-----------");
		p = rotateRight(l1, 12);
		while (p != null) {
			System.out.print(p.val + " → ");
			p = p.next;
		}
	}
}
