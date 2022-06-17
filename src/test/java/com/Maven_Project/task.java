package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class task {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\cdeem\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		TakesScreenshot ss =  (TakesScreenshot)driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\Desktop\\screenshot\\scrrenshot1.png");
		
		FileHandler.copy(source, dest);
		
	}
	
	
}
