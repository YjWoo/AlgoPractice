package sword.to.offer2;

import java.util.ArrayList;

public class Q_LastRemaining {
	// 从0开始，循环m个数抽取对应数，返回0~n-1中最后剩下的数字(圆圈中最后剩下的数字)
	public static int LastRemaining(int n, int m) {
		if (n <= 0 || m <= 0)
			return -1;
		ArrayList<Integer> id = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			id.add(i);
		}
		int index = -1;
		while (id.size() > 1) {
			index = (index + m) % id.size();
			id.remove(index);
			index--;
		}
		return id.get(0);
	}
	
	//递归版，约瑟夫之环
	public static int LastRemaining_Recursion(int n, int m) {
		if (n == 0)
			return -1;
		if (n == 1)
			return 0;
		else
			return (LastRemaining_Recursion(n - 1, m) + m) % n;
	}

	public static void main(String[] args) {

		System.out.println(LastRemaining(6, 7));// 4
		System.out.println(LastRemaining(5, 3));// 3
		System.out.println("--------------");
		System.out.println(LastRemaining_Recursion(6, 7));// 4
		System.out.println(LastRemaining_Recursion(5, 3));// 3
	}
}
