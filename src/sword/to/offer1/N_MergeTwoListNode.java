package sword.to.offer1;

public class N_MergeTwoListNode {
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	// 递归合并两个递增有序的单链表
	public static ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		if (list1.val <= list2.val) {
			list1.next = Merge(list1.next, list2);
			return list1;
		} else {
			list2.next = Merge(list1, list2.next);
			return list2;
		}
	}

	public static void main(String[] args) {
		ListNode l0 = new ListNode(0);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(6);

		l0.next = l1;
		l1.next = l2;
		l2.next = l3;

		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(5);
		ListNode l7 = new ListNode(7);

		l4.next = l5;
		l5.next = l6;
		l6.next = l7;

		ListNode n = Merge(l0, l4);
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}
}
