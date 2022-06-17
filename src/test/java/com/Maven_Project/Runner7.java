package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.Login1;

public class Runner7 extends baseclass{

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		
		urllaunch("https://adactinhotelapp.com/SearchHotel.php");
		
		Login1 lp1 = new Login1(driver);
		
		passinput(lp1.getUsername(),"gopiking");
		
		passinput(lp1.getPassword(),"Gopinath@1993");
		

		clickelement(lp1.getLogin());
		
		
		
		
		
		
		
		
		

		select (lp1.getLocation(), "ByIndex", "5");
		

		select(lp1.getHotels(), "Byvalue", "Hotel Sunshine");
		

		select(lp1.getRoomtype(), "ByIndex", "4");


		select(lp1.getNoofrooms(), "ByIndex", "6");
		

        lp1.getCheckin().clear();
        passinput(lp1.getCheckin(),"06/06/2022");
		

        lp1.getCheckout().clear();
        passinput(lp1.getCheckout(),"10/06/2022");	
		

        select(lp1.getAdultperroom(), "ByIndex", "2");
        

		select (lp1.getChildrenperroom(), "ByIndex", "0");
        

        clickelement(lp1.getSearch());
        

        clickelement(lp1.getRadiobutton());
        

        clickelement(lp1.getContinuee());
        

        passinput(lp1.getFirstname(),"gopinath");
        

        passinput(lp1.getLastname(),"palanivel");
        

        passinput(lp1.getAddress(),"77,T.P.Arumugam nagar,Tiruchengode");       


        passinput(lp1.getCreditcardno(),"1234567890123456");   
        

        select(lp1.getCreditcardtype(), "ByvisibleText", "VISA" );
        

        select(lp1.getExpmon(), "Byvalue", "10");
        

        select(lp1.getExpyear(), "ByIndex", "12");
        

        passinput(lp1.getCvv(),"564");
        

        clickelement(lp1.getBooknow());
        
        
        clickelement(lp1.getMyitineraray());
        

        clickelement(lp1.getLogout());

		
		
		
		
	}
	
	
}
