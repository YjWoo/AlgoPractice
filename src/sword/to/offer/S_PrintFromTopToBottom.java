package sword.to.offer;

import java.util.ArrayList;

public class S_PrintFromTopToBottom {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 从上到下打印二叉树所有节点，同层左->右打印(层次遍历)
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null)
			return null;
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<TreeNode> queue = new ArrayList<>();
		queue.add(root);
		TreeNode p;
		while (queue.size() != 0) {
			p = queue.remove(0);
			if (p.left != null)
				queue.add(p.left);
			if (p.right != null)
				queue.add(p.right);
			result.add(p.val);
		}
		return result;
	}
}
