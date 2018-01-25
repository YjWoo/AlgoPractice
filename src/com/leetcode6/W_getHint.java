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

	public static void main(String[] args) {
		System.out.println(new W_getHint().getHint("347566", "548732"));
		System.out.println(new W_getHint().getHint("748523", "548732"));
	}
}
