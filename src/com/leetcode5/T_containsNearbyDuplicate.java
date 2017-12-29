package com.leetcode5;

import java.util.HashMap;

public class T_containsNearbyDuplicate {
	
	//是否存在重复项且重复项之间距离小于k
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int distance;
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], i);
			else {
				distance = map.get(nums[i]);
				if (Math.abs(distance - i) <= k)
					return true;
				map.put(nums[i], i);
			}
		}

		return false;
	}
}
