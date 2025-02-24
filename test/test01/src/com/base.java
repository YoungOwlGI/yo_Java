package com;

public class base {
	public static void main(String[] args) {
		String s = "hello world";
//		长度
		int lenth = s.length();
		System.out.println(lenth);
//		单位子
		char s1 = s.charAt(10);
		System.out.println(s1);
//		范围位子
		String s2 = s.substring(2,5);
		System.out.println(s2);
//		全大写
		String s3 = s.toUpperCase();
		System.out.println(s3);
//		l --> m
		String s4 = s.replace("l", "m");
		System.out.println(s4);
		
		boolean result = s.startsWith("h");
		System.out.println(result);
	}
}
