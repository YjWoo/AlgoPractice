package sword.to.offer1;

import java.util.ArrayList;

public class Z_GetLeastNumbers {
	// 选出input中最小的k个数，冒泡法O(n*k),快排O(nlogn),堆排序O(nlogk)
	public static ArrayList<Integer> GetLeastNumbers(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if (input.length == 0 || k >= input.length)
			return result;
		int temp;
		for (int i = 0; i < k; i++) {
			for (int j = i; j < input.length; j++) {
				if (input[j] < input[i]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			result.add(input[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 543, 6, 34, 232, 2, 53, 4 };
		System.out.println(GetLeastNumbers(arr, 4));
	}
}
