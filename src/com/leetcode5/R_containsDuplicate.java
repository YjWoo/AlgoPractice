package com.leetcode5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class R_containsDuplicate {

	// 数组内是否包含重复值（MAP）
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				map.put(nums[i], map.get(nums[i]) + 1);
		}
		for (int i : map.keySet())
			if (map.get(i) != 1)
				return true;
		return false;
	}
	
	//Set方法
	public boolean containsDuplicateBySet(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++)
			if (set.add(i))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[] array = { 2, -1, 1, -1, 2 };
		R_containsDuplicate main=new R_containsDuplicate();
		
		System.out.println(main.containsDuplicate(array));
		System.out.println(main.containsDuplicateBySet(array));
	}
}
