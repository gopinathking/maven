package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Dresses;

public class Page_object_manger1 {
	
	public WebDriver driver;
	
	private Dresses d;
	
	
	public Page_object_manger1(WebDriver driver2) {
	  this.driver=driver2;
	}

	public Dresses getinstancedresses() {
		
		if(d==null)
		d = new Dresses(driver);
		
		return d;

	}
}
