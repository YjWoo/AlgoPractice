package com.leetcode2;

import java.util.ArrayList;

public class I_setZeroes {
	// 矩阵为零项，设置该项完整行列均为零
	public static void setZeroes(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0)
					list.add(i * n + j);
			}
		}
		int temp, x, y;
		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			x = temp / n;
			y = temp % n;
			setZero(x, y, matrix);
		}
	}

	public static void setZero(int m, int n, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			matrix[i][n] = 0;
		for (int i = 0; i < matrix[0].length; i++)
			matrix[m][i] = 0;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 0, 12 }, { 13, 14, 15, 16 } };
		printMatrix(arr);
		setZeroes(arr);
		System.out.println("---------------");
		printMatrix(arr);
	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
