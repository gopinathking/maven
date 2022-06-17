package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {

	public WebDriver driver;
		
	public Dresses(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(id="quantity_wanted")
	private WebElement qty;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	private WebElement  addtocart;
	
	
}
