package sword.to.offer2;

public class U_multiplyMatrix {
	public static int[] multiplyMatrix(int[] A) {
		int[] result = new int[A.length];
		for (int i = 0; i < result.length; i++) {
			int sum = 1;
			for (int j = 0; j < A.length; j++) {
				if (j == i && j < A.length)
					continue;
				if (j == i && j >= A.length)
					break;
				sum *= A[j];
			}
			result[i] = sum;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 6, 4 };
		int[] result = multiplyMatrix(array);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
