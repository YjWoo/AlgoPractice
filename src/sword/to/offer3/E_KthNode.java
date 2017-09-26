package sword.to.offer3;

import java.util.ArrayList;

public class E_KthNode {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}
	//二叉排序树，返回第k个节点
	TreeNode KthNode(TreeNode pRoot, int k) {
		ArrayList<TreeNode> list = new ArrayList<>();
		inOrder(pRoot, list);
		if (k <= 0 || k >= list.size())
			return null;
		return list.get(k - 1);
	}

	public void inOrder(TreeNode pRoot, ArrayList<TreeNode> list) {
		if (pRoot == null)
			return;
		inOrder(pRoot.left, list);
		list.add(pRoot);
		inOrder(pRoot.right, list);
	}
}
