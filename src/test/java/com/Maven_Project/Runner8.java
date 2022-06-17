package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.Searchhotels;

public class Runner8 extends baseclass {

	public static void main(String[] args) {
		
        launchBrowser("chrome");
		
		urllaunch("https://adactinhotelapp.com/SearchHotel.php");
		
		Searchhotels sc = new Searchhotels(driver);
		

		select (sc.getLocation(), "ByIndex", "5");
		

		select(sc.getHotels(), "Byvalue", "Hotel Sunshine");
		

		select(sc.getRoomtype(), "ByIndex", "4");


		select(sc.getNoofrooms(), "ByIndex", "6");
		

        sc.getCheckin().clear();
        passinput(sc.getCheckin(),"06/06/2022");
		

        sc.getCheckout().clear();
        passinput(sc.getCheckout(),"10/06/2022");	
		

        select(sc.getAdultperroom(), "ByIndex", "2");
        

		select (sc.getChildrenperroom(), "ByIndex", "0");
        

        clickelement(sc.getSearch());
        

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
