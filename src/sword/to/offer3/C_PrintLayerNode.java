package sword.to.offer3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C_PrintLayerNode {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 层次遍历每行节点并打印
	ArrayList<ArrayList<Integer>> PrintLayerNode(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (pRoot == null)
			return result;
		ArrayList<Integer> layerResult = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		int start = 0, end = 1;
		queue.add(pRoot);
		while (!queue.isEmpty()) {
			TreeNode p = queue.remove();
			layerResult.add(p.val);
			start++;
			if (p.left != null) {
				queue.add(p.left);
			}
			if (p.right != null) {
				queue.add(p.right);
			}
			if (start == end) {
				end = queue.size();
				start = 0;
				result.add(layerResult);
				layerResult = new ArrayList<Integer>();
			}
		}
		return result;
	}
}
