package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {

	@Ignore
	@Test
	public void ticket() {
		System.out.println("ticket");
	}
	@Test(dependsOnMethods = "ticket")
	public void cinema() {
		System.out.println("cinema");

	}
	
	
}
