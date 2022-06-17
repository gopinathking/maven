package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import com.Maven_Project.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\feature1\\hotel.feature",
                  glue = "C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\stepdefinition1\\stepdefinition.java",
                  monochrome= true, dryRun= true,  plugin= {"html:Report"})

public class Test_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
		driver = baseclass.launchBrowser("Chrome");

	}
	

}
