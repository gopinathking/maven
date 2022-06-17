package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome"))
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\cdeem1\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	public static void urllaunch(String url) {
		driver.get(url);
		}	
	public static void gettitle() {
		driver.getTitle();
		}		
	public static void closebrowser() {
		driver.close();
		}
	public static void Quit() {
		driver.quit();
		}
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void accept() {
		driver.switchTo().alert().accept();
	}
	public static void dismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void passinput(WebElement element ,String input) {
        element.sendKeys(input);
		}
	public static void clickelement(WebElement element) {
		element.click();
	}
    public static void is_displayed(WebElement element) {
		element.isDisplayed();
	}
    public static void is_enabled(WebElement element) {
		element.isEnabled();
	}
    
    public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	public static void clear() {
             clear();	
	}
    
	public static void name(WebElement element) {
		element.isSelected();
	}

	public static void select(WebElement element,String Options,String Byselectmethod) {
	
		Select obj = new Select(element);
		
		if(Options.equalsIgnoreCase("ByIndex")) {
			
			int val= Integer.parseInt(Byselectmethod);
			
			obj.selectByIndex(val);
		}
		else if(Options.equalsIgnoreCase("ByvisibleText")) {
			obj.selectByVisibleText(Byselectmethod);
		
	}
		else if(Options.equalsIgnoreCase("Byvalue")) {
			obj.selectByValue(Byselectmethod);
		}
		
		
	}
	}
	
		
		
	
    	


