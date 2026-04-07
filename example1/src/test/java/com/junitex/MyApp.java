package com.junitex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.operations.ArithmaticOperations;

public class MyApp {
	@Test
	public void testAdd()
	{
		ArithmaticOperations a = new ArithmaticOperations();
		int actualResult= a.add(10,20);
		int expectedResult=30;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testmul()
	{
		ArithmaticOperations a= new ArithmaticOperations();
		int actualResult = a.mul(100,2);
		int expectedResult=200;
		assertEquals(expectedResult, actualResult);
	}
	

}
