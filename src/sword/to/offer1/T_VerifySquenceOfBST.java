package sword.to.offer1;

public class T_VerifySquenceOfBST {
	// 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return false;
		return judge(sequence, 0, sequence.length - 1);
	}

	public static boolean judge(int[] a, int l, int r) {
		if (l >= r)
			return true;

		int i = r;
		while (i > l && a[i - 1] > a[r])
			--i;
		for (int j = i - 1; j >= l; --j)
			if (a[j] > a[r])
				return false;
		return judge(a, l, i - 1) && (judge(a, i, r - 1));
	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 2, 6, 7, 3, 1 };
		int[] arr2 = { 4, 1, 2, 6, 7, 3, 5 };

		System.out.println(VerifySquenceOfBST(arr1));
		System.out.println(VerifySquenceOfBST(arr2));

	}
}
