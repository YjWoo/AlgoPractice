package sword.to.offer1;

import java.util.Stack;

public class R_IsPopOrder {
	// 判断popA是否是pushA的出队次序
	public static boolean IsPopOrder(int[] pushA, int[] popA) {
		Stack<Integer> stack = new Stack<>();
		int n = 0;
		for (int i = 0; i < popA.length; i++) {
			while (n < pushA.length && pushA[n] != popA[i]) {
				stack.push(pushA[n]);
				n++;
			}
			if (n < pushA.length && pushA[n] == popA[i]) {
				n++;
				continue;
			}
			if (popA[i] == stack.peek()) {
				stack.pop();
				n++;
				continue;
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] in = { 1, 2, 3, 4, 5 };
		int[] out1 = { 1, 3, 2, 5, 4 };
		int[] out2 = { 1, 2, 3, 5, 4 };
		System.out.println(IsPopOrder(in, out1));
		System.out.println(IsPopOrder(in, out2));
	}
}
