package com.leetcode5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class S_getSkyline {

	// 二维数组表示建筑物，三元值分别为左坐标、右坐标、建筑物高度，返回建筑物群的天际线坐标列表
	public List<int[]> getSkyline(int[][] buildings) {
		List<int[]> result = new ArrayList<>();
		List<int[]> height = new ArrayList<>();
		for (int[] b : buildings) {
			height.add(new int[] { b[0], -b[2] });
			height.add(new int[] { b[1], b[2] });
		}
		Collections.sort(height, (a, b) -> {
			if (a[0] != b[0])
				return a[0] - b[0];
			return a[1] - b[1];
		});
		Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
		pq.offer(0);
		int prev = 0;
		for (int[] h : height) {
			if (h[1] < 0) {
				pq.offer(-h[1]);
			} else {
				pq.remove(h[1]);
			}
			int cur = pq.peek();
			if (prev != cur) {
				result.add(new int[] { h[0], cur });
				prev = cur;
			}
		}
		return result;
	}
}
