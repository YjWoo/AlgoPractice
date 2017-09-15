package sword.to.offer1;

public class K_reOrderArray {
	// 数组排序，奇数在前，偶数在后，同类数次序不变
	public static void reOrderArray(int[] array) {
		if (array.length <= 1)
			return;
		int tmp;
		int n = 0;
		int m = 0;
		while (m < array.length) {
			while (array[n] % 2 == 1)
				n++;
			m = n;
			while (array[m] % 2 == 0) {
				m++;
				if (m >= array.length)
					break;
			}
			if (n < m && m < array.length) {
				tmp = array[m];
				for (int j = m - 1; j >= n; j--) {
					array[j + 1] = array[j];
				}
				array[n] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
