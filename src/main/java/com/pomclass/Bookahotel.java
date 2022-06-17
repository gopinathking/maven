package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotel {

	public WebDriver driver;
	
	public Bookahotel (WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditcardno;
	
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	

	
	
	
	
	
}
