package sword.to.offer1;

public class W_ConvertTreeToDLinkedList {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	TreeNode head = null;
	TreeNode realHead = null;

	// 二叉排序树转为双向链表
	public TreeNode Convert(TreeNode pRootOfTree) {
		ConvertSub(pRootOfTree);
		return realHead;
	}

	public void ConvertSub(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return;
		ConvertSub(pRootOfTree.left);
		if (head == null) {
			head = pRootOfTree;
			realHead = pRootOfTree;
		} else {
			head.right = pRootOfTree;
			pRootOfTree.left = head;
			head = pRootOfTree;
		}
		ConvertSub(pRootOfTree.right);
	}
}
