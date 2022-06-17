package com.testng;

import org.testng.annotations.Test;

public class Time_Out {

	@Test(timeOut = 13000)
	public void login() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("browser launch");
		
		Thread.sleep(5000);
		System.out.println("url launch");
		
		Thread.sleep(3000);
		System.out.println("login");

	}
	
	
}
