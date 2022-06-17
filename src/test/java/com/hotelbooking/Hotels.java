package com.hotelbooking;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\feature1\\hotel.feature",
                  glue = "C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\stepdefinition1\\stepdefinition.java",
                  monochrome= true, dryRun= true,  plugin= {"html:Report"})
public class Hotels {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\cdeem1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
}
