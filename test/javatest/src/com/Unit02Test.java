package com;

import static org.junit.Assert.*;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class Unit02Test {

	@Test
	public void test_count() {
//		获取实际值
		Unit02 u = new Unit02();
		String s = u.count(2024, 13);
//		断言 预估的结果 和 实际s 是否一样
		MatcherAssert.assertThat("月份输入不正确", Matchers.equalTo(s));

	}
	
		@Test
		public void test_count02() {
			Unit02 u = new Unit02();
			String s = u.count(2024, 3);
			MatcherAssert.assertThat("2024年3月的天数是31天", Matchers.equalTo(s));
	}
		
		@Test
		public void test_count03() {
			Unit02 u = new Unit02();
			String s = u.count(2024, 6);
			MatcherAssert.assertThat("2024年6月的天数是30天", Matchers.equalTo(s));
		}
		
		@Test
		public void test_count04() {
			Unit02 u = new Unit02();
			String s = u.count(2024, 2);
			MatcherAssert.assertThat("2024年2月的天数是29天", Matchers.equalTo(s));

		}
		@Test
		public void test_count05() {
			Unit02 u = new Unit02();
			String s = u.count(2021, 2);
			MatcherAssert.assertThat("2021年2月的天数是28天", Matchers.equalTo(s));
	}
}
