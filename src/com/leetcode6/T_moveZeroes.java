package com.leetcode6;

public class T_moveZeroes {

	// 将所有零元素移动到数组末端。直接选择：时间复杂度O(n2)
	public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] != 0) {
						nums[i] = nums[j];
						nums[j] = 0;
						break;
					}
				}
			}
		}
	}

	// 另一种解法,时间复杂度O(n)
	public void moveZeroes2(int[] nums) {
		int index = 0;
		for (int i : nums)
			if (i != 0)
				nums[index++] = i;
		while (index < nums.length)
			nums[index++] = 0;
	}

	public static void main(String[] args) {
		int[] array = { 5, 2, 3, 0, 43, 0, 0, 6, 43, 0, 12, 4, 23 };

		// new T_moveZeroes().moveZeroes(array);
		new T_moveZeroes().moveZeroes2(array);

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
