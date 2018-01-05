package com.leetcode6;

import java.util.ArrayList;
import java.util.List;

public class A_summaryRanges {
	// 返回连续范围值，如[1,2,3,7,8,9,23]返回["1->3","7"->"9",23]
	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int l, r;
		for (int i = 0; i < nums.length; i++) {
			l = i;
			r = i;
			while (r < nums.length - 1 && nums[r + 1] == nums[r] + 1)
				r++;
			if (l == r)
				res.add(String.valueOf(nums[l]));
			else {
				sb.append(String.valueOf(nums[l]));
				sb.append("->");
				sb.append(String.valueOf(nums[r]));
				res.add(sb.toString());
				sb = new StringBuilder();
			}
			i = r;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] array={1,2,3,7,8,9,23};
		System.out.println(new A_summaryRanges().summaryRanges(array));
	}
}
