package com.leetcode1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class U_MergeIntervalsList {
	
	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
	//合并列表内所有Interval类
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<>();
		intervals.sort(new Comparator<Interval>() {
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		while (!intervals.isEmpty()) {
			Interval pre = intervals.remove(0);
			while (!intervals.isEmpty()) {
				if (intervals.get(0).start > pre.end)
					break;
				pre.end = Math.max(intervals.remove(0).end, pre.end);
			}
			result.add(pre);
		}
		return result;
	}
}
