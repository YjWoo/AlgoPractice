package sword.to.offer2;

public class T_StrToInt {
	
	//字符串转整数，不使用库
	public static int StrToInt(String str) {
		char[] chars = str.toCharArray();
		int num = 0;
		int flag = 1;
		for (int i = 0; i < chars.length; i++) {
			num *= 10;
			if (i == 0 && chars[i] == 43) {
				flag = 1;
				continue;
			}
			if (i == 0 && chars[i] == 45) {
				flag = -1;
				continue;
			}
			if (chars[i] > 57 || chars[i] < 49)
				return 0;
			num += chars[i] - 48;
		}
		return num * flag;
	}

	public static void main(String[] args) {
		System.out.println(StrToInt("434643"));
		System.out.println((int) '+');
		System.out.println((int) '-');
	}
}
