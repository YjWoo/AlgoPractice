package sword.to.offer;

public class G_Fibonacci {
	// 斐波那契数列
	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(Fibonacci(i));
		}
	}
}
