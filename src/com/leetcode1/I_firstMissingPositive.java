package com.leetcode1;

public class I_firstMissingPositive {
	// 给定乱序数组，寻找数组完成排序后第一个不连续的正数，要求时间复杂度O(n)，且不允许开辟新空间
	public int firstMissingPositive(int[] nums) {
		int n = nums.length;
		if (n == 0)
			return 1;
		int k = partition(nums) + 1;
		int temp = 0;
		int first_missing_Index = k;
		for (int i = 0; i < k; i++) {
			temp = Math.abs(nums[i]);
			if (temp <= k)
				nums[temp - 1] = (nums[temp - 1] < 0) ? nums[temp - 1] : -nums[temp - 1];
		}
		for (int i = 0; i < k; i++) {
			if (nums[i] > 0) {
				first_missing_Index = i;
				break;
			}
		}
		return first_missing_Index + 1;
	}
	
	//为数组分区，并返回负数位置
	public int partition(int[] A) {
		int n = A.length;
		int q = -1;
		for (int i = 0; i < n; i++) {
			if (A[i] > 0) {
				q++;
				swap(A, q, i);
			}
		}
		return q;
	}
	//使用位运算符交换值
	public void swap(int[] A, int i, int j) {
		if (i != j) {
			A[i] ^= A[j];
			A[j] ^= A[i];
			A[i] ^= A[j];
		}
	}

	public static void main(String[] args) {
		I_firstMissingPositive solution = new I_firstMissingPositive();
		int[] array = { 2, 1, -1, 3, 4, 6 };

		System.out.println(solution.firstMissingPositive(array));
	}
}
