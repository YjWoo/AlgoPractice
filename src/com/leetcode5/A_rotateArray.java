package com.leetcode5;

public class A_rotateArray {
	// 将数组右移动k位
	public void rotate(int[] nums, int k) {
		k %= nums.length;
		if (k >= nums.length)
			return;
		int[] nums1 = new int[nums.length - k];
		int[] nums2 = new int[k];
		for (int i = 0; i < nums1.length; i++)
			nums1[i] = nums[i];
		for (int i = 0; i < nums2.length; i++)
			nums2[i] = nums[nums.length - k + i];
		for (int i = 0; i < nums.length; i++) {
			if (i < k)
				nums[i] = nums2[i];
			else
				nums[i] = nums1[i - k];
		}

	}
	
	//另一种方法
	public void rotate2(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
