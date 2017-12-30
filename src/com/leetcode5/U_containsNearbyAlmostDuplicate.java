package com.leetcode5;

import java.util.HashMap;
import java.util.Map;

public class U_containsNearbyAlmostDuplicate {
	// 给定一个整数数组，找出数组中是否有两个不同的索引i和j，使得对应值之间的绝对差最大为t，而i和j之间的绝对差最大ķ
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (k < 1 || t < 0)
			return false;
		Map<Long, Long> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
			long bucket = remappedNum / ((long) t + 1);
			if (map.containsKey(bucket) || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
					|| (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= t))
				return true;
			if (map.entrySet().size() >= k) {
				long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
				map.remove(lastBucket);
			}
			map.put(bucket, remappedNum);
		}
		return false;
	}
}
