package com.leetcode5;

public class P_findKthLargest {
	// 选出无序数组内第k大的数
	public int findKthLargest(int[] nums, int k) {
		int temp, max, n;
		for (int i = 0; i < k; i++) {
			n = i;
			max = nums[i];
			for (int j = i; j < nums.length; j++)
				if (max < nums[j]) {
					max = nums[j];
					n = j;
				}
			if (n != i) {
				temp = nums[i];
				nums[i] = max;
				nums[n] = temp;
			}
		}
		return nums[k - 1];
	}

	public static void main(String[] args) {
		int[] aa = { -1, 2, 0, 6, 4, 7, 5, 3, 54, 342, 45 };
		System.out.println(new P_findKthLargest().findKthLargest(aa, 4));
	}
}
