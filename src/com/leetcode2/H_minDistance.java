package com.leetcode2;

public class H_minDistance {
	// 可以对字符进行插入、删除、替换操作，word1变为word2需要进行多少步操作，使用DP法
	// word1[i]==word2[j]，f(i,j)=f(i-1,j-1);
	// word1[i]!=word2[j]，f(i,j)=1+min{f(i,j-1),f(i-1,j),f(i-1,j-1)}
	public int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();

		int[][] cost = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++)
			cost[i][0] = i;
		for (int i = 1; i <= n; i++)
			cost[0][i] = i;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (word1.charAt(i) == word2.charAt(j))
					cost[i + 1][j + 1] = cost[i][j];
				else {
					int a = cost[i][j];
					int b = cost[i][j + 1];
					int c = cost[i + 1][j];
					cost[i + 1][j + 1] = a < b ? (a < c ? a : c) : (b < c ? b : c);
					cost[i + 1][j + 1]++;
				}
			}
		}
		return cost[m][n];
	}
}
