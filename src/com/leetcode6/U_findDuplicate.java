package com.leetcode6;

public class U_findDuplicate {
	// 数组存在(长度-1)个不同的数，查找重复元素并返回，时间复杂度O(nlogn)，空间复杂度O(1)
	public int findDuplicate(int[] nums) {
		int low = 1, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int cnt = 0;
			for (int a : nums) {
				if (a <= mid)
					++cnt;
			}
			if (cnt <= mid)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low;
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 2, 1, 6, 7, 8 };
		System.out.println(new U_findDuplicate().findDuplicate(array));
	}
}
