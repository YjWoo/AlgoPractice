package sword.to.offer2;

public class Y_DeleteDuplicationNode {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	// 删除链表重复节点
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode head = new ListNode(-1);
		head.next = pHead;
		ListNode p = head;
		ListNode q = p;
		while (p != null) {
			q = p.next;
			if (q != null && q.next != null && q.val == q.next.val) {
				while (q != null && q.next != null && q.val == q.next.val) {
					q = q.next;
				}
				p.next = q.next;
				continue;
			}
			p = p.next;
		}
		return head.next;
	}
}
