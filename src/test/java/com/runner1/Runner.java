package com.runner1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Maven_Project.baseclass;
import com.pomclass1.Page_Object_Manager;
import com.pomclass1.loginpage;
import com.properties1.File_Reader_Manager;

public class Runner extends baseclass{
	
	public static WebDriver driver = launchBrowser ("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_url();
		urllaunch (url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_username();
		passinput(pom.getInstanceLogin().getUsername(),username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_password();
		passinput(pom.getInstanceLogin().getPassword(),password);
		
		clickelement(pom.getInstanceLogin().getLogin());
		
		select (pom.getInstanceLogin().getLocation(), "ByIndex", "4");
		
		select (pom.getInstanceLogin().getHotels(), "ByIndex", "3");
		
		select (pom.getInstanceLogin().getRoomtype(), "ByIndex", "2");
		
		select (pom.getInstanceLogin().getRoomnos(),"ByIndex", "3");
		
		String checkin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckin();
		pom.getInstanceLogin().getCheckin().clear();
		passinput (pom.getInstanceLogin().getCheckin(),checkin);
		
        String checkout = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckout();
        pom.getInstanceLogin().getCheckout().clear();
        passinput(pom.getInstanceLogin().getCheckout(),checkout);
        
        select (pom.getInstanceLogin().getAdultroom(),"ByIndex", "3");
        
        select(pom.getInstanceLogin().getChildroom(),"ByIndex", "1");
        
        clickelement (pom.getInstanceLogin().getSubmit());
		
		
		
		
		
	}
	
	
	
	
}
