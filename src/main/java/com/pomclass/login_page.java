package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	public WebDriver driver;
	
	@FindBy(id ="email")
	private WebElement username;
	
	public login_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id= "SubmitLogin")
	private WebElement login;
	
	
}
