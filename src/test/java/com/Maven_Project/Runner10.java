package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomclass.Login1;
import com.properties.File_Reader_Manager;
import com.properties.File_Reader_Manager1;
import com.sdp.Page_Object_Manager2;

public class Runner10 extends baseclass {

	public static WebDriver driver = launchBrowser("chrome");
	
	public static Page_Object_Manager2 pom1= new Page_Object_Manager2(driver);
	
	public static void main(String[] args) throws IOException {
		
		
		urllaunch("https://adactinhotelapp.com/");
		
		
		passinput(pom1.getInstancelogin().getUsername(),"gopinathking");
		
		passinput(pom1.getInstancelogin().getPassword(),"Gopinath@1993");
		
	    clickelement(pom1.getInstancelogin().getLogin());
	        
	    select(pom1.getInstancelogin().getLocation());
	    
	    select(pom1.getInstanceSearch().getHotels());
	    
	    select(pom1.getInstanceSearch().getRoomtype());
	    
	    select(pom1.getInstanceSearch().getRoomtype());
	    
	    select(pom1.getInstanceSearch().getNoofrooms());
	    
	    passinput(pom1.getInstanceSearch().getCheckin());
	    
	    passinput(pom1.getInstanceSearch().getCheckout());
	    
	    select(pom1.getInstanceSearch().getAdultperroom());
	    
	    select(pom1.getInstanceSearch().getChildrenperroom());
	    
	    clickelement(pom1.getInstanceSearch().getSearch());
	    
	    clickelement(pom1.getInstancelogin().getRadiobutton());
	    
	    clickelement(pom1.getInstancelogin().getContinuee());
	    
	    passinput(pom1.getInstancebook().getFirstname());
	    
	    passinput(pom1.getInstancebook().getLastname());
	    
	    passinput(pom1.getInstancebook().getAddress());
	    
	    passinput(pom1.getInstancebook().getCreditcardno());
	    
	    select(pom1.getInstancebook().getCreditcardtype());
	    
	    select(pom1.getInstancebook().getExpmon());
	    
	    select(pom1.getInstancebook().getExpyear());
	    
	    passinput(pom1.getInstancebook().getCvv());
	    
	    clickelement(pom1.getInstancebook().getBooknow());
	    
	    
	    
	    

	
	
}

	private static void passinput(WebElement checkin) {
		// TODO Auto-generated method stub
		
	}

	private static void select(WebElement location) {
		// TODO Auto-generated method stub
		
	}
}
