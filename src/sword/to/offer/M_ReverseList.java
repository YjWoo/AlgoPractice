package sword.to.offer;

import java.util.Stack;

public class M_ReverseList {
	//节点定义
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	//	反转链表节点，利用栈实现
	public static ListNode ReverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		Stack<ListNode> stack = new Stack<>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		ListNode result = stack.pop();
		ListNode p = result;
		while (!stack.isEmpty()) {
			p.next = stack.pop();
			p = p.next;
		}
		p.next = null;
		return result;
	}
	
	//简便方法
//	public static ListNode ReverseList(ListNode head) {
//	    ListNode pre = null;
//	    ListNode next = null;
//	    while (head != null) {
//	        next = head.next;
//	        head.next = pre;
//	        pre = head;
//	        head = next;
//	    }
//	    return pre;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l0 = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);

		l0.next = l1;
		l1.next = l2;
		l2.next = l3;

		ListNode n = ReverseList(l0);
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}

}
