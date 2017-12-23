package com.leetcode5;

import java.util.ArrayList;
import java.util.List;

public class M_findWords {

	// 在二维字符数组内找到words内存在的单词(相邻遍历)并返回列表
	// 正确解法：前缀树+回溯法
	public List<String> findWords(char[][] board, String[] words) {
		List<String> res = new ArrayList<>();
		TrieNode root = buildTrie(words);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				dfs(board, i, j, root, res);
			}
		}
		return res;
	}

	// 深度优先遍历
	public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
		char c = board[i][j];
		if (c == '#' || p.next[c - 'a'] == null)
			return;
		p = p.next[c - 'a'];
		if (p.word != null) { // found one
			res.add(p.word);
			p.word = null; // de-duplicate
		}

		board[i][j] = '#';
		if (i > 0)
			dfs(board, i - 1, j, p, res);
		if (j > 0)
			dfs(board, i, j - 1, p, res);
		if (i < board.length - 1)
			dfs(board, i + 1, j, p, res);
		if (j < board[0].length - 1)
			dfs(board, i, j + 1, p, res);
		board[i][j] = c;
	}

	// 生成前缀树
	public TrieNode buildTrie(String[] words) {
		TrieNode root = new TrieNode();
		for (String w : words) {
			TrieNode p = root;
			for (char c : w.toCharArray()) {
				int i = c - 'a';
				if (p.next[i] == null)
					p.next[i] = new TrieNode();
				p = p.next[i];
			}
			p.word = w;
		}
		return root;
	}

	// 前缀树定义
	class TrieNode {
		TrieNode[] next = new TrieNode[26];
		String word;
	}

	// 错误解法
	public List<String> findWordsError(char[][] board, String[] words) {
		List<String> res = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int x = 0; x < board.length; x++) {
				for (int y = 0; y < board[0].length; y++) {
					if (word.charAt(0) == board[x][y])
						if (isExist(board, word, 0, x, y) && !res.contains(word))
							res.add(word);

				}
			}
		}
		return res;
	}

	public boolean isExist(char[][] board, String word, int index, int x, int y) {
		if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || index >= word.length()
				|| word.charAt(index) != board[x][y])
			return false;
		if (index == word.length() - 1 && word.charAt(index) == board[x][y])
			return true;
		if (word.charAt(index) == board[x][y])
			index++;
		return isExist(board, word, index, x + 1, y) || isExist(board, word, index, x - 1, y)
				|| isExist(board, word, index, x, y + 1) || isExist(board, word, index, x, y - 1);
	}

	public static void main(String[] args) {
		char[][] characters = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'n', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = { "oath", "pea", "eat", "rain", "eaten" };
		for (int i = 0; i < characters.length; i++) {
			for (int j = 0; j < characters[0].length; j++) {
				System.out.print(characters[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		System.out.println(new M_findWords().findWords(characters, words));
	}
}
