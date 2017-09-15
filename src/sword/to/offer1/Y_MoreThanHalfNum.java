package sword.to.offer1;

import java.util.Arrays;

public class Y_MoreThanHalfNum {
	// 选出数组过半的数字,可用快排，可用hashmap
	public static int MoreThanHalfNum_Solution(int[] array) {
		if (array.length == 0)
			return 0;
		if (array.length == 1) {
			return array[0];
		}
		int sum = 0;
		int[] sort = array;
		Arrays.sort(sort);
		for (int i = 0; i < sort.length; i++) {
			if (i + 1 < sort.length && sort[i] == sort[i + 1]) {
				sum++;
				if (sum >= sort.length / 2) {
					return sort[i + 1];
				}
			} else {
				sum = 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 6, 6, 6, 6, 6, 1 };
		System.out.println(MoreThanHalfNum_Solution(arr));
	}
}
