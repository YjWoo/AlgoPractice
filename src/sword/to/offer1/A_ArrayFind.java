package sword.to.offer1;

public class A_ArrayFind {
	// 二维数组查找,array行列递增
	public static boolean Find(int target, int[][] array) {
		if (array.length != 0 && array[0].length != 0) {
			for (int i = 0; i < array.length; i++) {
				if (target >= array[i][0] && target <= array[i][array[i].length - 1]) {
					for (int j = 0; j < array[i].length; j++) {
						if (target == array[i][j]) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] array={{1,2},{3,4,5,6,7},{8,9,10}};
		System.out.println(Find(4, array));
		System.out.println(Find(21, array));
	}
}
