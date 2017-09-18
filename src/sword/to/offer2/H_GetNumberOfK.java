package sword.to.offer2;

public class H_GetNumberOfK {
	// 数字在排序数组中的出现次数
	public static int GetNumberOfK(int[] array, int k) {
		int n = 0;
		int i = 0;
		while (i < array.length) {
			if (array[i] == k) {
				n++;
			}
			if (array[i] > k) {
				break;
			}
			i++;
		}
		return n;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 4, 5, 6, 7 };
		System.out.println(GetNumberOfK(array, 3));
	}
}
