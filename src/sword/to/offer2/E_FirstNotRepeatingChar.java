package sword.to.offer2;

import java.util.LinkedHashMap;

public class E_FirstNotRepeatingChar {
	// 获取字符串中第一个不重复的字符，LinkedHashMap保证输入、输出有序
	public static int FirstNotRepeatingChar(String str) {
		int pos = -1;
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (!hashMap.containsKey(chars[i])) {
				hashMap.put(chars[i], 0);
			}
			hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
		}
		for (int i = 0; i < chars.length; i++) {

			char c = str.charAt(i);
			if (hashMap.get(c) == 1) {
				return i;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("dsfsdftsdfsdf"));
	}
}
