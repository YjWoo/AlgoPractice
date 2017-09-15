package sword.to.offer1;

public class P_MirrorTree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 镜像二叉树，将所有左右子树翻转
	public void Mirror(TreeNode root) {
		if (root == null)
			return;
		root = exchangeTree(root);
		Mirror(root.left);
		Mirror(root.right);
	}

	public TreeNode exchangeTree(TreeNode p) {
		if (p.left == null && p.right == null)
			return p;
		TreeNode tmp;
		tmp = p.left;
		p.left = p.right;
		p.right = tmp;
		return p;
	}
}
