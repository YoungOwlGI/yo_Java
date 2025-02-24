package com;

public class Unit02{
//	定义方法：参数year，month 返回值：年，月 的天数是30天。
	public String count(int year,int month) {
//		判断 month
		if (month<1 || month>12) {
			return "月份输入不正确";
		}else if(month != 2) {
//			1,3,5,7,8,10,12
			if (month==1 || month==3 || month==5 || month==7 
					|| month==8 || month==10 || month==12) {
				return year + "年" + month + "月的天数是31天";
			}else {
				return year + "年" + month + "月的天数是30天";
			}
		}else {
//			判断是否是闰年
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return year + "年" + month + "月的天数是29天";
			}else {
				return year + "年" + month + "月的天数是28天";
			}
		}
	}
}