package sword.to.offer2;

public class A_FindGreatestSumOfSubArray {
	// 返回数组内连续子向量最大值
	public static int FindGreatestSumOfSubArray(int[] array) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				max = sum > max ? sum : max;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, -4, -3, 4, 1 };
		System.out.println(FindGreatestSumOfSubArray(array));
	}
}
