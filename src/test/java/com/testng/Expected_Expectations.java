package com.testng;

import org.testng.annotations.Test;

public class Expected_Expectations {

	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		
		int a=20;
		
		System.out.println(a/0);

	}
	
	
}
