package com.leetcode7;

public class G_isValidSerialization {
	// 判断preorder是否为二叉树序列，空节点#表示
	public boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");
		int diff = 1;
		for (String node : nodes) {
			if (--diff < 0)
				return false;
			if (!node.equals("#"))
				diff += 2;
		}
		return diff == 0;
	}
}
