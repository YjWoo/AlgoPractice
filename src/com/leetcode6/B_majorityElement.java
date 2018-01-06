package com.leetcode6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B_majorityElement {
	//返回数组中出现(数组长度/3)次以上的数字
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				map.put(nums[i], map.get(nums[i]) + 1);
		for (Integer n : map.keySet())
			if (map.get(n) > nums.length / 3)
				res.add(n);
		return res;
	}

	//Boyer-Moore算法
	public List<Integer> majorityElementWithoutMap(int[] nums) {
		if (nums == null || nums.length == 0)
			return new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		int number1 = nums[0], number2 = nums[0], count1 = 0, count2 = 0, len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == number1)
				count1++;
			else if (nums[i] == number2)
				count2++;
			else if (count1 == 0) {
				number1 = nums[i];
				count1 = 1;
			} else if (count2 == 0) {
				number2 = nums[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == number1)
				count1++;
			else if (nums[i] == number2)
				count2++;
		}
		if (count1 > len / 3)
			result.add(number1);
		if (count2 > len / 3)
			result.add(number2);
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = { 2, -1, 1, -1, 2 };
		System.out.println(new B_majorityElement().majorityElement(array));
	}
}
