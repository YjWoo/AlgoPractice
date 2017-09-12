package sword.to.offer;

import java.util.ArrayList;
import java.util.Stack;


public class C_printListFromTailToHead {

	// 链表节点定义
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	// 从尾到头打印链表
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		ListNode lNode = listNode;
		while (lNode != null) {
			stack.push(lNode.val);
			lNode = lNode.next;
		}
		ArrayList<Integer> result = new ArrayList<>();
		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode l0=new ListNode(0);
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		
		l0.next=l1;
		l1.next=l2;
		l2.next=l3;
		
		System.out.println(printListFromTailToHead(l0).toString());
	}
}
