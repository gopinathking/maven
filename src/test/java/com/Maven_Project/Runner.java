package com.Maven_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Runner extends baseclass{

	public static void main(String[] args) throws IOException {
		
		
	launchBrowser("chrome");
	
	urllaunch("http://automationpractice.com/index.php");
	
	WebElement signin = driver.findElement(By.xpath("/html/body/div/div/header/div[2]/div/div/nav/div/a[1]"));
	signin.click();
		
	WebElement username = driver.findElement(By.id("email"));
	passinput(username, "gopinathkingofmech@gmail.com");
	
	WebElement password = driver.findElement(By.id("passwd"));
	passinput(password, "8838629981");
	
	WebElement signin1 = driver.findElement(By.id("SubmitLogin"));
	signin1.click();
	
	WebElement Dresses = driver.findElement(By.className("sf-with-ul"));
	Dresses.click();
	
	WebElement printeddresses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[2]/h5/a"));
	printeddresses.click();
	
	WebElement qty = driver.findElement(By.id("quantity_wanted"));
	qty.clear();
	passinput(qty,"3");
	
	WebElement size = driver.findElement(By.id("group_1"));
	Select s=new Select(size);
	s.selectByIndex(1);
	
	WebElement addtocart = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
	addtocart.click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement addtocart1 = driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
	addtocart1.click();
	
	}
	
	
}
