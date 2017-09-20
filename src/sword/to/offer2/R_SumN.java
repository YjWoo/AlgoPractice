package sword.to.offer2;

public class R_SumN {
	// 1+..+n
	public static int SumN(int n) {
		if (n == 1)
			return 1;
		return SumN(n - 1) + n;
	}

	public static void main(String[] args) {
		System.out.println(SumN(100));
	}
}
