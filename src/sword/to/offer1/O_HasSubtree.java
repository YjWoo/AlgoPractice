package sword.to.offer1;

public class O_HasSubtree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 判断root2是否是root1的子结构树
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = ifContain(root1, root2);
			}
			if (!result) {
				result = HasSubtree(root1.left, root2);
			}
			if (!result) {
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
	}
	
	public boolean ifContain(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 != null)
			return false;
		if (root2 == null)
			return true;
		if (root1.val != root2.val)
			return false;
		return ifContain(root1.left, root2.left) && ifContain(root1.right, root2.right);
	}
}
