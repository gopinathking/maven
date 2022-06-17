package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
	public WebDriver driver;
	
	public Summary(WebDriver driver2) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getProceedtocheckout1() {
		return proceedtocheckout1;
	}


	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}


	@FindBy(xpath="/html/body/div/div/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	
	private WebElement addtocart;
	
	@FindBy(xpath="html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	
	private WebElement proceedtocheckout1;
	
	
	@FindBy(xpath="/html/body/div/div[2]/div/div [3]/div/p[2]/a [1]/span")
	
	private WebElement proceedtocheckout;
	
	
	
	

}
