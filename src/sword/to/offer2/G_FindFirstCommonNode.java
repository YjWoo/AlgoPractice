package sword.to.offer2;

import java.util.ArrayList;

public class G_FindFirstCommonNode {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	// 输入两个链表，找出它们的第一个公共结点。
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ArrayList<ListNode> list = new ArrayList<>();
		ListNode p = pHead1;
		while (p != null) {
			list.add(p);
			p = p.next;
		}
		ListNode q = pHead2;
		while (q != null) {
			if (list.contains(q)) {
				return q;
			}
			q = q.next;
		}
		return null;
		// 无需计算长度的解法
		// ListNode p1 = pHead1;
		// ListNode p2 = pHead2;
		// while(p1!=p2){
		// p1 = (p1==NULL ? pHead2 : p1.next);
		// p2 = (p2==NULL ? pHead1 : p2.next);
		// }
		// return p1;
	}

}
