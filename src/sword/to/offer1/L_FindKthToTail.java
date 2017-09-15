package sword.to.offer1;

public class L_FindKthToTail {
	// 节点
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	// 输出倒数第k个节点
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;
		ListNode result = head;
		ListNode p = head;
		int n = k - 1;
		while (n >= 1) {
			p = p.next;
			if (p == null)
				return null;
			n--;
		}
		while (p.next != null) {
			p = p.next;
			result = result.next;
		}
		return result;
	}
	
}
