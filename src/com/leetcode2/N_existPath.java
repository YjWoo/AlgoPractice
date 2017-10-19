package com.leetcode2;

public class N_existPath {
	static boolean[][] visited;

	// 判定board内是否存在word的字符路径，不允许回头
	public static boolean exist(char[][] board, String word) {
		visited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if ((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean search(char[][] board, String word, int i, int j, int index) {
		if (index == word.length()) {
			return true;
		}

		if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index)
				|| visited[i][j]) {
			return false;
		}

		visited[i][j] = true;
		if (search(board, word, i - 1, j, index + 1) || search(board, word, i + 1, j, index + 1)
				|| search(board, word, i, j - 1, index + 1) || search(board, word, i, j + 1, index + 1)) {
			return true;
		}

		visited[i][j] = false;
		return false;
	}

	public static void main(String[] args) {
		char[][] mat = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		printMatrix(mat);
		System.out.println("---------------------");
		System.out.println("ABCD"+" : "+exist(mat, "ABCD"));
		System.out.println("ABCCED"+" : "+exist(mat, "ABCCED"));
		System.out.println("SEE"+" : "+exist(mat, "SEE"));

	}

	public static void printMatrix(char[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
