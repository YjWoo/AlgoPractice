package sword.to.offer2;

import java.util.ArrayList;

public class M_FindNumbersWithSum {
	// array递增，返回两个和为sum的数，有多个时，返回乘积最小的
	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> copy = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			copy.add(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			if (copy.contains(sum - array[i])) {
				result.add(array[i]);
				result.add(sum - array[i]);
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 4, 5, 6, 7 };
		System.out.println(FindNumbersWithSum(array, 7));
	}
}
