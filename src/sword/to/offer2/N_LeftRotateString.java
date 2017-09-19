package sword.to.offer2;

public class N_LeftRotateString {
	// 循环左移（ROL）,str左移n位
	public static String LeftRotateString(String str, int n) {
		StringBuilder sb = new StringBuilder();
		char[] copy = str.toCharArray();
		if (n >= copy.length)
			return sb.toString();
		for (int i = n; i < copy.length; i++) {
			sb.append(copy[i]);
		}
		for (int i = 0; i < n; i++) {
			sb.append(copy[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		
		System.out.println(LeftRotateString("HelloWorld", 5));
	}
}
