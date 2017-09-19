package sword.to.offer2;

public class O_ReverseSentence {

	// 单词顺序翻转
	public static String ReverseSentence(String str) {
		if (str == null || str.trim().equals(""))
			return str;
		String[] s = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = s.length - 1; i >= 0; i--) {
			sb.append(s[i]);
			if (i != 0)
				sb.append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(ReverseSentence("Hello World! Nice to meet you!"));
	}
}
