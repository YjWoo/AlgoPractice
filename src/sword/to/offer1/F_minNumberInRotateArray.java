package sword.to.offer1;

public class F_minNumberInRotateArray {
	//旋转数组最小数字
	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0)
			return 0;
		if (array.length > 1) {
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					return array[i];
				}
			}
		}
		return array[0];
	}
	
	public static void main(String[] args) {
		int[] array={4,5,6,7,1,2,3};
		System.out.println(minNumberInRotateArray(array));
	}
}
