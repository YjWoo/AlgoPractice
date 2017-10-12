package com.leetcode1;

public class X_generateMatrix {

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int num = 1;
		int i = 0, j = 0;
		int loop = n;
		while (num <= n * n) {
			if (i < n && j < n) {
				result[i][j] = num;
				if (i == n - loop && j < loop - 1) {
					j++;
				} else if (j == loop - 1 && i < loop - 1) {
					i++;
				} else if (i == loop - 1 && j == loop - 1) {
					j--;
				} else if (i == loop - 1 && j > n - loop) {
					j--;
				} else if (i == loop - 1 && j == n - loop) {
					i--;
				} else if (i > n - loop + 1 && j == n - loop) {
					i--;
				} else if (i == n - loop + 1 && j == n - loop) {
					loop--;
					j++;
				}
			}
			num++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = generateMatrix(12);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
