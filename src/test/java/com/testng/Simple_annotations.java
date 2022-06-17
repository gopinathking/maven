package com.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {

	@BeforeSuite
	public void property_setting() {
		System.out.println("property_setting");
	}
	@BeforeTest
	public void browserlaunch() {
		System.out.println("browserlaunch");
	}
	@BeforeClass
	public void urllaunch() {
		System.out.println("urllaunch");
	}
	
	@BeforeMethod
	public void signin() {
		System.out.println("signin");
	}
	@Test
	public void Women() {
		System.out.println("Women");
	}
	@Test
	public void men() {
		System.out.println("men");
	}
	@Test
	public void kids() {
		System.out.println("kids");
	}
	@AfterMethod
	public void signout() {
		System.out.println("signout");
	}
	@AfterClass
	public void homepage() {
		System.out.println("homepage");
	}
	@AfterTest
	public void closebrowser() {
		System.out.println("closebrowser");
	}
	@AfterSuite
	public void quitbrowser() {
		System.out.println("quit browser");

	}
}
