package com.finalcut;

import static org.junit.Assert.*;

import org.junit.Test;

public class dashbTest {

	@Test
	public void test() {
		dashb d1=new dashb();
		assertEquals("You Entered: aaa and bbb",d1.add("aaa", "bbb"));
		dashb d2=new dashb();
		assertEquals("You Entered: aaa and bbb",d2.add("aaa", "bbb"));
		dashb d3=new dashb();
		assertEquals("You Entered: aaa and bbb",d3.add("aaa", "bbb"));
	}

}
