package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Bookahotel;
import com.pomclass.Login1;
import com.pomclass.Searchhotels;

public class Page_Object_Manager2 {

	public WebDriver driver;
	
	private Login1 lp1;
	private Searchhotels sc;
	private Bookahotel bh ;
	
	public Page_Object_Manager2(WebDriver driver2) {
		this.driver=driver2;
	}
	public Login1 getInstancelogin() {
	    if (lp1==null) {	
	    lp1 = new Login1(driver);
		Login1 lp1 = new Login1(driver);
	}
		return lp1;
	}
	
	public Searchhotels getInstanceSearch() {
		
		if(sc==null) {
			sc= new Searchhotels(driver);
			Searchhotels sc = new Searchhotels(driver);
		}
		return sc;
	}
	
	public Bookahotel getInstancebook() {
		if(bh == null) {
			bh=new Bookahotel (driver);
			
			Bookahotel bh =new Bookahotel(driver);
		}
		return bh;
		
	}
	
	
	

	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	

