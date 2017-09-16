package sword.to.offer2;

public class B_NumberOf1Between1AndN {
	// 1~n中'1'出现的次数
	public static int NumberOf1Between1AndN(int n) {
		int sum = 0;
		int m;
		for (int i = 1; i <= n; i++) {
			int num = i;
			while (num != 0) {
				m = num % 10;
				if (m == 1) {
					sum++;
				}
				num = num / 10;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN(1200));
	}
}
