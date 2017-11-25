package com.leetcode4;

public class C_canCompleteCircuit {
	// 沿着圆形路线有N个加油站，其中站i处的气体量是气体[i]。一辆汽车从车站i到下一站（i+1）需要花费天然气。如果可以巡回，则返回加油站的索引，否则返回-1。
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int candidate = 0;
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < gas.length * 2; i++) {
			sum += gas[i % gas.length] - cost[i % gas.length];
			if (sum < 0) {
				candidate = i + 1;
				sum = 0;
				cnt = 0;
			} else {
				cnt++;
				if (cnt >= gas.length) {
					return candidate;
				}
			}
		}
		return -1;
	}

}
