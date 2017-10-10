package com.leetcode1;

import java.util.ArrayList;

public class S_spiralOrder {
	// 顺时针遍历矩阵
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		if (matrix == null)
			return null;
		ArrayList<Integer> result = new ArrayList<>();
		if (matrix.length == 0 || matrix[0].length == 0)
			return result;
		if (matrix.length <= 1) {
			for (int i = 0; i < matrix[0].length; i++) {
				result.add(matrix[0][i]);
			}
			return result;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int i = 0, j = 0;
		int loop = 0;
		boolean[][] path = new boolean[m][n];
		while (path[i][j] != true) {
			result.add(matrix[i][j]);
			path[i][j] = true;
			if (i == loop && j < n - loop - 1) {
				j++;
			} else if (j == loop - 1 && i > loop) {
				i--;
			} else if (j == n - loop - 1 && i < m - loop - 1) {
				i++;
			} else if (i == m - loop - 1 && j > loop) {
				j--;
			} else if (i == m - loop - 1 && j == loop) {
				loop++;
				i--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] matrix2 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };

		System.out.println(spiralOrder(matrix1).toString());
		System.out.println(spiralOrder(matrix2).toString());
	}
}
