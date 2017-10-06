package com.leetcode1;

public class J_trap {
	// 以下标为x轴，以对应height值为y轴，作宽度=1的柱状图，想象为一个水池，返回水池装水数量
	public static int trap(int[] height) {
		int a = 0;
		int b = height.length - 1;
		int max = 0;
		int leftmax = 0;
		int rightmax = 0;
		while (a <= b) {
			leftmax = Math.max(leftmax, height[a]);
			rightmax = Math.max(rightmax, height[b]);
			if (leftmax < rightmax) {
				max += (leftmax - height[a]);
				a++;
			} else {
				max += (rightmax - height[b]);
				b--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int[] array1 = { 5, 4, 1, 2 };
		System.out.println(trap(array));
		System.out.println(trap(array1));
	}
}
