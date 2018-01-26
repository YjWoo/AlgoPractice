package com.leetcode6;

import java.util.ArrayList;

public class W_getHint {
	// 猜数字游戏
	public String getHint(String secret, String guess) {
		int numA = 0, numB = 0;
		ArrayList<Character> listS = new ArrayList<>();
		ArrayList<Character> listG = new ArrayList<>();
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i))
				numA++;
			else {
				listS.add(secret.charAt(i));
				listG.add(guess.charAt(i));
			}
		}
		for (int i = 0; i < listS.size(); i++) {
			if (listG.contains(listS.get(i))) {
				listG.remove(listS.get(i));
				numB++;
			}
		}
		return String.format("%dA%dB", numA, numB);
	}

	// 另一种方式，更低的时间、空间复杂度
	public String getHint2(String secret, String guess) {
		int numA = 0, numB = 0;
		int[] numbers = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			int s = Character.getNumericValue(secret.charAt(i));
			int g = Character.getNumericValue(guess.charAt(i));
			if (s == g)
				numA++;
			else {
				if (numbers[s] < 0)
					numB++;
				if (numbers[g] > 0)
					numB++;
				numbers[s]++;
				numbers[g]--;
			}
		}
		return String.format("%dA%dB", numA, numB);
	}

	public static void main(String[] args) {
		System.out.println(new W_getHint().getHint("347566", "548732"));
		System.out.println(new W_getHint().getHint2("748523", "548732"));
	}
}
