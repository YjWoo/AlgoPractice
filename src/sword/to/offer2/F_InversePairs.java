package sword.to.offer2;

public class F_InversePairs {

	// 寻找数组内逆序对个数，使用归并排序，时间复杂度O(nlogn)
	public static int InversePairs(int[] array) {

		// 时间复杂度O(n2)
		// int sum = 0;
		// for (int i = 1; i < array.length; i++) {
		// for (int j = 0; j < i; j++) {
		// if (array[j] > array[i]) {
		// sum++;
		// }
		// }
		// }
		// return sum % 1000000007;

		if (array == null || array.length == 0) {
			return 0;
		}
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		int count = InversePairsCore(array, copy, 0, array.length - 1);// 数值过大求余
		return count;
	}

	private static int InversePairsCore(int[] array, int[] copy, int low, int high) {
		if (low == high) {
			return 0;
		}
		int mid = (low + high) >> 1;
		int leftCount = InversePairsCore(array, copy, low, mid) % 1000000007;
		int rightCount = InversePairsCore(array, copy, mid + 1, high) % 1000000007;
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;

		while (i >= low && j > mid) {
			if (array[i] > array[j]) {
				count += j - mid;
				copy[locCopy--] = array[i--];
				count = count >= 1000000007 ? count % 1000000007 : count;
			} else {
				copy[locCopy--] = array[j--];
			}
		}
		for (; i >= low; i--) {
			copy[locCopy--] = array[i];
		}
		for (; j > mid; j--) {
			copy[locCopy--] = array[j];
		}
		for (int s = low; s <= high; s++) {
			array[s] = copy[s];
		}
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0, 4, 6 };

		System.out.println(InversePairs(array));
	}
}
