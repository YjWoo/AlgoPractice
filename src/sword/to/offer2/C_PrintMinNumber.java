package sword.to.offer2;

import java.util.Arrays;
import java.util.Comparator;

public class C_PrintMinNumber {
	// 返回数组构成的最小整数字符串，利用比较器实现
	public static String PrintMinNumber(int[] numbers) {
		StringBuilder sb = new StringBuilder();
		if (numbers == null || numbers.length == 0)
			return "";
		int len = numbers.length;
		String[] str = new String[len];
		for (int i = 0; i < len; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String c1 = s1 + s2;
				String c2 = s2 + s1;
				return c1.compareTo(c2);
			}
		});
		for (int i = 0; i < len; i++) {
			sb.append(str[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int[] arr = { 3, 546, 24, 12, 87 };
		System.out.println(PrintMinNumber(arr));
	}
}
