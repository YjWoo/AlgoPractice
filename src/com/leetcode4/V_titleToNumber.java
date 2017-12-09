package com.leetcode4;

import java.util.Date;

public class V_titleToNumber {

	// Excel Sheet Column Title，1<-A,2<-B,26<-Z,27<-AA……
	public int titleToNumber(String s) {
		int result = 0;
		int pos = 0, num, bit;
		for (int i = s.length() - 1; i >= 0; i--) {
			pos++;
			num = s.charAt(i) - 'A' + 1;
			bit = pos;
			while (bit > 1) {
				num *= 26;
				bit--;
			}
			result += num;
		}
		return result;
	}

	public int titleToNumber2(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(new V_titleToNumber().titleToNumber("BBBAA"));
		Date date2=new Date();
		System.out.println(new V_titleToNumber().titleToNumber2("BBBAA"));
		Date date3=new Date();
		System.out.println(date2.getTime()-date1.getTime());
		System.out.println(date3.getTime()-date2.getTime());
	}
}
