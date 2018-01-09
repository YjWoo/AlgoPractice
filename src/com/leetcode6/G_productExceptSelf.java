package com.leetcode6;

public class G_productExceptSelf {
	// 返回的数组每一位的值等于原数组其他所有项的乘积
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		res[0] = 1;
		for (int i = 1; i < n; i++) {
			res[i] = res[i - 1] * nums[i - 1];
		}
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			res[i] *= right;
			right *= nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 7, -8, 6, 4, -14, 4 };
		array = new G_productExceptSelf().productExceptSelf(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
