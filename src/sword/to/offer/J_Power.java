package sword.to.offer;

public class J_Power {
	//求幂值
	public static double Power(double base, int exponent) {
		double result = 1;
		if (exponent >= 0)
			for (int i = 0; i < exponent; i++) {
				result *= base;
			}
		else {
			exponent=Math.abs(exponent);
			for (int i = 0; i < exponent; i++) {
				result /= base;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Power(1.6, 3));
		System.out.println(Power(1.6, -3));
	}
}
