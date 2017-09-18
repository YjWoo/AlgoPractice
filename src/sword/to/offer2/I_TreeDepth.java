package sword.to.offer2;

public class I_TreeDepth {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 返回二叉树深度
	public int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;

		return TreeDepth(root.left) > TreeDepth(root.right) ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;
	}
}
