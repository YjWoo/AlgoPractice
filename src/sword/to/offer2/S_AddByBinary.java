package sword.to.offer2;

public class S_AddByBinary {
	// 返回数字和，二进制运算
	public static int AddByBinary(int num1, int num2) {
		while (num2 != 0) {
			// 位相加
			int temp = num1 ^ num2;
			// 确定进位
			num2 = (num1 & num2) << 1;
			num1 = temp;
		}
		return num1;
	}

	public static void main(String[] args) {
		System.out.println(AddByBinary(4, 89));
	}
}
