package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.Bookahotel;

public class Runner9 extends baseclass{
	
	public static void main(String[] args) {
		
        launchBrowser("chrome");
		
		urllaunch("https://adactinhotelapp.com/SearchHotel.php");
		
		Bookahotel bh = new Bookahotel(driver);

        passinput(bh.getFirstname(),"gopinath");
        

        passinput(bh.getLastname(),"palanivel");
        

        passinput(bh.getAddress(),"77,T.P.Arumugam nagar,Tiruchengode");       


        passinput(bh.getCreditcardno(),"1234567890123456");   
        

        select(bh.getCreditcardtype(), "ByvisibleText", "VISA" );
        

        select(bh.getExpmon(), "Byvalue", "10");
        

        select(bh.getExpyear(), "ByIndex", "12");
        

        passinput(bh.getCvv(),"564");
        

        clickelement(bh.getBooknow());
        
        
		
		
		
		
		
		
		
		
		
		
	}
}
