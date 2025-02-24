package com;

public class TestString {
//	定义方法：返回值 字符串  参数：字符串
	public String Remove(String s) {
//		s： 以ab开头，那么ab用ef替换
		if(s.startsWith("ab")) {
//			字符串的替换方法：replace（老字符串，新字符串）
			String newi = s.replace("ab", "ef");
			return "替换前缀后的字符串为："+newi;
		}else if(s.endsWith("cd")) {
			String newi = s.replace("cd", "gh");
			return "替换cd后的字符串为："+newi;
		}else {
			String newi = s.toUpperCase();
			return "大写字母的字符串为："+newi;
		}
	}
//	验证手机号，地址
	public String testi(String phone,String address) {
//  定义验证手机号的正则表达式
		String r1 = "^[0-9]{11}$";
//		字母开头的10个（含10）以内的字母和数字组成
		String r2 = "^[a-zA-Z][a-zA-Z0-9]{0,9}$";
//		验证
		if(phone.matches(r1) && address.matches(r2)) {
			return "OK";
		}else if (phone.matches(r1) && !address.matches(r2)) {
			return "地址符合要求。";
		}else if (!phone.matches(r1) && address.matches(r2)) {
			return "手机号不符合要求。";
		}else {
			return "手机号和地址不符合要求。";
		}
	}

}
