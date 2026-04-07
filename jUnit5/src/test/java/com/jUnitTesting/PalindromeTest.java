package com.jUnitTesting;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit5.Palindrome;

public class PalindromeTest {
	@ParameterizedTest
	@ValueSource(strings= {"racecar","madam","liril","yakub"})
	public void  PalindromeTest(String  str) {
		Palindrome p= new Palindrome();
		boolean actual =p.isPalindrome(str);
		assertTrue(actual);
	}
	
}


