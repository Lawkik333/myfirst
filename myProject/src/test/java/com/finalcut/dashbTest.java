package com.finalcut;

import static org.junit.Assert.*;

import org.junit.Test;

public class dashbTest {

	@Test
	public void test() {
		dashb d1=new dashb();
		assertEquals("You Entered: aaa and bbb",d1.add("aaa", "bbb"));
		dashb d2=new dashb();
		assertEquals("You Entered: 123 and 234",d2.add("123", "234"));
		dashb d3=new dashb();
		assertEquals("You Entered: a2b and a@n",d3.add("a2b", "a@n"));
	}

}
