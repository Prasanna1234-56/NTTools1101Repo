package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Airthmetic;

public class AppTest {
	@Test
	public void testWithNegatives() {
		Airthmetic ar=new Airthmetic();
		int expected=-40;
		int actual=ar.sum(-20,-20);
		assertEquals(expected,actual);
	}
	@Test
	public void testWithPositives() {
		Airthmetic ar=new Airthmetic();
<<<<<<< HEAD
		int expected=60;
		int actual=ar.sum(40, 20);
=======
		int expected=40;
		int actual=ar.sum(20, 20);
		assertEquals(expected,actual);
	}
	@Test
	public void testWithZeros() {
		Airthmetic ar=new Airthmetic();
		int expected=0;
		int actual=ar.sum(0, 0);
>>>>>>> refs/heads/master
		assertEquals(expected,actual);
	}
<<<<<<< HEAD
	@Test
	public void testWithNegatives() {
		Airthmetic ar=new Airthmetic();
		int expected=-40;
		int actual=ar.sum(-20, -20);
		assertEquals(expected,actual);
	}
	@Test
	public void testWithZeros() {
		Airthmetic ar=new Airthmetic();
		int expected=0;
		int actual=ar.sum(0, 0);
		assertEquals(expected,actual);
	}
=======

>>>>>>> refs/heads/master
	
}
