package com;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class unit03Test {
	
	private String expected;//预期返回值
	private String a;//测试返回值
	
//	生成构造方法 快捷键：shift+alt+s
	public unit03Test(String expected, String a) {
		super();
		this.expected = expected;
		this.a = a;
	}
	/*
	 * 设计测试数据：条件覆盖：每个条件的真和假都设计
	 * 第一个条件：s.startsWith("ab") 真：abhello 假：hello
	 * 第二个条件：s.endsWith("cd") 真：hellocd 假：hello
	 * 最后： hello
	 * 
	 * 测试数据：abhello
	 * 			hellocd
	 * 			hello 
	 * */
	public static Collection<Object[]>  data(){
		
		return Arrays.asList(new Object[][]) {
			{"替换前缀后的字符串为：efhello","abhello"},
			{"替换cd后的字符串为：hellogh","hellocd"},
			{"大写字母的字符串为：hello","hello"}
		});
	}
	@Test
	public void test_letter() {
		Unit04 u = new Unit04();
		String exc
		
	}



}
