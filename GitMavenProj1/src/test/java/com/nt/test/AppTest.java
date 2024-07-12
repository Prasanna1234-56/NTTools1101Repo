package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Airthmetic;

public class AppTest {
	@Test
	public void testWithPositives() {
		Airthmetic ar=new Airthmetic();
		int expected=40;
		int actual=ar.sum(20, 20);
		assertEquals(expected,actual);
	}
	
}
