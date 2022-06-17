package com.pomclass1;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public WebDriver driver;
	
    private loginpage lp;
    
    public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public loginpage getInstanceLogin() {
    	
    	if (lp==null) {
		
    	lp = new loginpage(driver);
    	}
    	
    	return lp;

	}
    
    
	
	
	
	
}
