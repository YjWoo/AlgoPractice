package sword.to.offer;

import java.util.ArrayList;

public class D_reConstructBinaryTree {
	// 二叉树节点定义
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// 给定先序、中序遍历，重建二叉树,解题思路：递归 （优化采用Arrays.copyOfRange()方法）
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		if (pre.length == 1 || in.length == 1)
			return root;
		ArrayList<Integer> leftIn = new ArrayList<>();
		ArrayList<Integer> rightIn = new ArrayList<>();
		ArrayList<Integer> leftPre = new ArrayList<>();
		ArrayList<Integer> rightPre = new ArrayList<>();
		int i = 0;
		while (in[i] != pre[0]) {
			leftIn.add(in[i]);
			i++;
		}
		i++;
		while (i < in.length) {
			rightIn.add(in[i]);
			i++;
		}

		for (int j = 0; j < pre.length; j++) {
			if (leftIn.contains(pre[j])) {
				leftPre.add(pre[j]);
			}
			if (rightIn.contains(pre[j])) {
				rightPre.add(pre[j]);
			}
		}
		int[] lp = null;
		if (leftPre.size() > 0) {
			lp = new int[leftIn.size()];
			for (int j = 0; j < lp.length; j++) {
				lp[j] = leftPre.get(j);
			}
		}
		int[] li = null;
		if (leftIn.size() > 0) {
			li = new int[leftIn.size()];
			for (int j = 0; j < li.length; j++) {
				li[j] = leftIn.get(j);
			}
		}
		int[] rp = null;
		if (rightPre.size() > 0) {
			rp = new int[rightPre.size()];
			for (int j = 0; j < rp.length; j++) {
				rp[j] = rightPre.get(j);
			}
		}
		int[] ri = null;
		if (rightIn.size() > 0) {
			ri = new int[rightIn.size()];
			for (int j = 0; j < ri.length; j++) {
				ri[j] = rightIn.get(j);
			}
		}
		root.left = reConstructBinaryTree(lp, li);
		root.right = reConstructBinaryTree(rp, ri);
		return root;
	}
	
	public static void main(String[] args) {
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		TreeNode root=reConstructBinaryTree(pre, in);
		TreeNode p=root;
		while (p!=null) {
			System.out.println("p:"+p.val);
			if(p.left!=null)
			System.out.println("p.left:"+p.left.val);
			if(p.right!=null)
			System.out.println("p.right:"+p.right.val);
			p=p.left;
		}
	}
}
