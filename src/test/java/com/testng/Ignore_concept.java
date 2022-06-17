package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {

	@Ignore
	@Test
	public void burger() {
		System.out.println("burger");
	}
	@Test
	public void pizza() {
		System.out.println("pizza");
	}
	@Test
	public void noodles() {
		System.out.println("noodles");
	}
	
	@Test
	public void sandwich() {
	    System.out.println("sandwich");
	}
	
}
