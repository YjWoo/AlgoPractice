package com.leetcode6;

public class H_searchMatrix {
	// 搜索矩阵内部是否存在target，矩阵行列按大小排序
	public boolean searchMatrix(int[][] matrix, int target) {
		int i = 0, j = matrix[0].length - 1;
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == target)
				return true;
			else if (matrix[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
	}
}
