package com;

public class unit03 {
	public String letter(String s) {
		if(s.startsWith("ab")) {
			String s2 = s.replace("ab", "ef");
			return "替换前缀后的字符串为：" +s2;
		}else if(s.endsWith("cd")) {
			String s3 = s.replace("cd", "ef");
			return "替换cd后的字符串为：" +s3;
		}else {
			String s4 = s.toUpperCase("ab", "ef");
			return "大写字母的字符串为：" +s4;
		}
	}
}
