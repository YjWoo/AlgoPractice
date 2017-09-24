package sword.to.offer3;

public class A_isSymmetrical {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	// 判断一颗二叉树是否对称
	boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null) {
			return true;
		}
		return comRoot(pRoot.left, pRoot.right);
	}

	private boolean comRoot(TreeNode left, TreeNode right) {
		if (left == null)
			return right == null;
		if (right == null)
			return false;
		if (left.val != right.val)
			return false;
		return comRoot(left.right, right.left) && comRoot(left.left, right.right);
	}
}
