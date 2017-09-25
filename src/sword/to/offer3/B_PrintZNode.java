package sword.to.offer3;

import java.util.ArrayList;
import java.util.Stack;

public class B_PrintZNode {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	// 按照之字形打印二叉树
	public ArrayList<ArrayList<Integer>> PrintZNode(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (pRoot == null)
			return result;
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		TreeNode p;
		int flag = 0;
		s1.push(pRoot);
		while (!s2.isEmpty() || !s1.isEmpty()) {
			if (flag % 2 == 0) {
				ArrayList<Integer> even = new ArrayList<>();
				while (!s1.isEmpty()) {
					p = s1.pop();
					if (p.left != null)
						s2.push(p.left);
					if (p.right != null)
						s2.push(p.right);
					even.add(p.val);
				}
				result.add(even);
			} else {
				ArrayList<Integer> odd = new ArrayList<>();
				while (!s2.isEmpty()) {
					p = s2.pop();
					if (p.right != null)
						s1.push(p.right);
					if (p.left != null)
						s1.push(p.left);
					odd.add(p.val);
				}

				result.add(odd);
			}
			flag++;
		}
		return result;
	}
}
