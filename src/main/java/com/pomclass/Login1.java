package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	public WebDriver driver;

	public Login1(WebDriver driver2) {
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

	
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuee() {
		return continuee;
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

	public WebElement getMyitineraray() {
		return myitineraray;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(name="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultperroom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childrenperroom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(className="reg_button")
	private WebElement continuee;
	
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
	
	@FindBy(xpath="/html/body[1]/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[2]")
	private WebElement myitineraray;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
