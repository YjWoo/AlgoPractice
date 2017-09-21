package sword.to.offer2;

public class X_EntryNodeOfLoop {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	//寻找环链表的环入口
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null)
			return null;
		ListNode p1 = pHead;
		ListNode p2 = pHead;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			//p1、p2相遇时，p1走过n个节点，p2走过2n，实际上p2比p1多走了一个环的步数
			if (p1 == p2) {
				//指向头结点，同步走，最终在环入口汇合
				p2 = pHead;
				while (p1 != p2) {
					p1 = p1.next;
					p2 = p2.next;
				}
				if (p1 == p2)
					return p1;
			}
		}
		return null;
	}
}
