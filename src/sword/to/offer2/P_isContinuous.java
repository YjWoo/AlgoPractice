package sword.to.offer2;

import java.util.Arrays;

public class P_isContinuous {
	// 查看数组是否连续递增，0可以替代任何数
	public static boolean isContinuous(int[] numbers) {
		if (numbers.length == 0)
			return false;
		int[] copy = numbers;
		Arrays.sort(copy);
		int ex = 0;
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] == 0)
				ex++;
		}
		for (int i = ex + 1; i < copy.length; i++) {
			if (copy[i] - copy[i - 1] != 1) {
				if (ex > 0 && copy[i] - copy[i - 1] <= ex + 1 && copy[i] != copy[i - 1]) {
					ex--;
					continue;
				}
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array = { 0, 2, 3, 6, 4 };
		System.out.println(isContinuous(array));
	}
}
