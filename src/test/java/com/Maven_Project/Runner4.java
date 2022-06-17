package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.ClickElement;

import com.pomclass.Summary;

public class Runner4 extends baseclass{

	public static void main(String[] args) throws IOException {
		
		launchBrowser("chrome");
		
		urllaunch("http://automationpractice.com/index.php?id_product=3&controller=product#/color-orange/size-m");
		
		Summary sm= new Summary(driver);
		
		clickelement(sm.getAddtocart());
		
		implicitwait();
		
		clickelement(sm.getProceedtocheckout1());
		
		TakesScreenshot ss =  (TakesScreenshot)driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\Desktop\\screenshot\\scrrenshot2.png");
		
		FileHandler.copy(source, dest);
		
		
		
		clickelement(sm.getProceedtocheckout());
		

		
		
	}
	
}
