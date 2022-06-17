package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotels {

	public WebDriver driver;

	public Searchhotels (WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
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

	
	
	
}
