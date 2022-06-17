package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner5 extends baseclass{

	
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		
		urllaunch("https://adactinhotelapp.com/index.php");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gopiking");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Gopinath@1993");
		
		WebElement login = driver.findElement(By.id("login"));
		clickelement(login);

		closebrowser();
	}
}
