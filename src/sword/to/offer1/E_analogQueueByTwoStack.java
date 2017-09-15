package sword.to.offer1;

import java.util.Stack;

public class E_analogQueueByTwoStack {
	// 用两个栈模拟队列，FILO-->FIFO
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void push(int node) {
		Stack<Integer> full = stack1.isEmpty() ? stack2 : stack1;
		full.push(node);
	}

	public static int pop() {
		Stack<Integer> full = stack1.isEmpty() ? stack2 : stack1;
		Stack<Integer> empty = stack1.isEmpty() ? stack1 : stack2;

		while (!full.isEmpty()) {
			empty.push(full.pop());
		}
		int result = empty.pop();
		while (!empty.isEmpty()) {
			full.push(empty.pop());
		}
		return result;
	}
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
}
