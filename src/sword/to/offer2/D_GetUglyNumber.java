package sword.to.offer2;

import java.util.ArrayList;

public class D_GetUglyNumber {
	// 返回第index个丑数
	public static int GetUglyNumber(int index) {
		// 时间复杂度过高
		// int num = 0;
		// int n = 0;
		// while (index >= 0) {
		// n++;
		// int temp = n;
		// while (temp % 3 == 0 || temp % 5 == 0 || temp % 2 == 0) {
		// if (temp % 2 == 0) {
		// temp /= 2;
		// } else if (temp % 3 == 0) {
		// temp /= 3;
		// } else if (temp % 5 == 0) {
		// temp /= 5;
		// }
		// }
		// if (temp == 1) {
		// index--;
		// num = n;
		// }
		// }
		// return num;
		if (index <= 0)
			return 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		while (list.size() < index)// 循环的条件
		{
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return list.get(list.size() - 1);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 18; i++) {
			System.out.println(GetUglyNumber(i));
		}
	}
}
