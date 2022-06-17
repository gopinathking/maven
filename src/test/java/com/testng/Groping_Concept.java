package com.testng;

import org.testng.annotations.Test;

public class Groping_Concept {

	@Test(groups = "foods")
	public void burger() {
		System.out.println("burger");
	}
	@Test(groups = "foods")
	public void pizza() {
		System.out.println("pizza");
	}
	
	
	@Test(groups = "softdrinks")
	public void coke() {
		System.out.println("coke");
	}

	@Test(groups = "softdrinks")
	public void pepsi() {
	    System.out.println("pepsi");
	}
	
	
	@Test(groups = "electronics")
    public void mobiles() {
		System.out.println("mobiles");
	}
	@Test
	public void laptop() {
		System.out.println("laptop");
	}
	
}

