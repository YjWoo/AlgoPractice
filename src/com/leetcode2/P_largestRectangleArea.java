package com.leetcode2;

public class P_largestRectangleArea {
	// 给定矩阵画直方图，返回最大矩形面积
	public int largestRectangleArea(int[] heights) {
		if (heights.length == 0)
			return 0;
		int area = heights[0];
		for (int i = 0; i < heights.length; i++) {
			if (i > 0 && heights[i] == heights[i - 1]) {
				area += heights[i];
				continue;
			}
			area = Math.max(area, rectangleArea(heights, i));
		}
		return area;
	}

	public int rectangleArea(int[] heights, int n) {
		int height = heights[n];
		int area = height;
		for (int i = n + 1; i < heights.length; i++) {
			if (heights[i] < height)
				height = heights[i];
			area = Math.max(area, height * (i - n + 1));
		}
		return area;
	}
}
