package sword.to.offer2;

import java.util.ArrayList;

public class L_FindContinuousSequence {
	// 输出所有和为S的连续正数序列
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> seq = new ArrayList<>();
		for (int i = 1; i <= sum; i++) {
			seq = FindOneSequence(sum, i);
			if (seq != null)
				result.add(seq);
		}
		return result;
	}

	public static ArrayList<Integer> FindOneSequence(int sum, int n) {
		ArrayList<Integer> seq = new ArrayList<>();
		int p = n;
		int numSum = 0;
		while (p < sum) {
			seq.add(p);
			numSum += p;
			p++;
			if (numSum == sum) {
				System.out.println(numSum);
				return seq;
			} else if (numSum > sum) {
				return null;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(FindContinuousSequence(1000).toString());
	}
}
