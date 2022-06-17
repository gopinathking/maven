package com.pomclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	public WebDriver driver;

	public loginpage(WebDriver driver1) {
		this.driver = driver1;
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

	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement login;
	
	
    public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	public WebElement getRoomnos() {
		return roomnos;
	}

	@FindBy(xpath = "//*[@id=\"location\"]")
    private WebElement location;
    
	@FindBy (xpath = "//*[@id=\"hotels\"]")
    private WebElement hotels;

	@FindBy (xpath = "//*[@id=\"room_type\"]")
	private WebElement roomtype;
	
	@FindBy (xpath = "//*[@id=\"room_nos\"]")
	private WebElement roomnos;
	
	@FindBy (xpath = "//*[@id=\"datepick_in\"]")
	private WebElement checkin;
	
	@FindBy (xpath = "//*[@id=\"datepick_out\"]")
	private WebElement checkout;
	
	@FindBy (xpath = "//*[@id=\"adult_room\"]")
	private WebElement adultroom;
	
	@FindBy (xpath = "//*[@id=\"child_room\"]")
	private WebElement childroom;
	
	@FindBy (xpath = "//*[@id=\"Submit\"]")
	private WebElement submit;


	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
