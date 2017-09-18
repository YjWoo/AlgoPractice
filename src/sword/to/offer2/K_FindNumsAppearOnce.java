package sword.to.offer2;

import java.util.HashMap;

public class K_FindNumsAppearOnce {

	// 查找仅出现一次的数字，返回输入num1、num2中
	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!hashMap.containsKey(array[i]))
				hashMap.put(array[i], 0);
			hashMap.put(array[i], hashMap.get(array[i]) + 1);
		}
		for (int i = 0; i < array.length; i++) {
			if (hashMap.get(array[i]) == 1) {
				if (num1[0] == 0) {
					num1[0] = array[i];
				} else if (num2[0] == 0 && num1[0] != 0) {
					num2[0] = array[i];
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 5, 5, 7 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(array, num1, num2);
		System.out.println(num1[0] + " " + num2[0]);
	}
}
