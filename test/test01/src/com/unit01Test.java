package com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class unit01Test {

	@Test
	public void testJisuan() {
		unit01 unit01 = new unit01();
		String s = unit01.jisuan(86, 86);
		Assert.assertEquals("a=2:", s);
	}

}
