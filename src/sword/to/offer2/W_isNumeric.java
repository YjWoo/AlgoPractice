package sword.to.offer2;

public class W_isNumeric {
	// 判断字符数字是否为数字，取巧代码，常规使用编译原理中的自动机实现
	public static boolean isNumeric(char[] str) {
		try {
			double re = Double.parseDouble(new String(str));
			System.out.println(re);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String num = "-456e+235";
		char[] cs = num.toCharArray();
		System.out.println(isNumeric(cs));
	}
}
