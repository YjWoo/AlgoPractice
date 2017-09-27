package sword.to.offer3;

import java.util.ArrayList;

public class G_maxInWindows {
	// 给定一个数组和滑动窗口的大小，输出数组中滑动窗口内的最大值
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> result = new ArrayList<>();
		if (size > num.length || size <= 0)
			return result;
		for (int i = 0; i <= num.length - size; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < size; j++) {
				max = max < num[i + j] ? num[i + j] : max;
			}
			result.add(max);
		}
		return result;
	}
}
