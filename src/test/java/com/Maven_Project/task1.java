package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class task1 extends baseclass{

	
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		
		urllaunch("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"dropdown1\"]"));
		
		select(dropdown1, "Byindex", "1");
		
		
		
	}
	
}
