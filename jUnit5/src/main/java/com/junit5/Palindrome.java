package com.junit5;

public class Palindrome {
	public boolean isPalindrome(String str)
	{
		String reverse="";
		int lenght = str.length();
		for(int i=lenght-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
