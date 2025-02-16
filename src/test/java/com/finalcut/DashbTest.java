package com.finalcut;

import static org.junit.Assert.*;

import org.junit.Test;

public class DashbTest {

	@Test
	public void test() {
		Dashb d1=new Dashb();
		assertEquals("You Entered: aaa and bbb",d1.add("aaa", "bbb"));
		Dashb d2=new Dashb();
		assertEquals("You Entered: 123 and 234",d2.add("123", "234"));
		Dashb d3=new Dashb();
		assertEquals("You Entered: a2b and a@n",d3.add("a2b", "a@n"));
	}

}
