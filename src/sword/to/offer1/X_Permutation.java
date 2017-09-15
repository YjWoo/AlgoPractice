package sword.to.offer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class X_Permutation {
	// 打印所有可能出现的字符串组合，回溯法，全排列
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return result;
		}
		HashSet<String> set = new HashSet<String>();
		fun(set, str.toCharArray(), 0);
		result.addAll(set);
		Collections.sort(result);
		return result;
	}

	void fun(HashSet<String> result, char[] str, int k) {
		if (k == str.length) {
			result.add(new String(str));
			return;
		}
		for (int i = k; i < str.length; i++) {
			swap(str, i, k);
			fun(result, str, k + 1);
			swap(str, i, k);
		}
	}

	void swap(char[] str, int i, int j) {
		if (i != j) {
			char t = str[i];
			str[i] = str[j];
			str[j] = t;
		}
	}

	public static void main(String[] args) {
		X_Permutation x = new X_Permutation();

		System.out.println(x.Permutation("abcde").toString());
	}
}
