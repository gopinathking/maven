package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner6 extends baseclass{

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		
		urllaunch("https://adactinhotelapp.com/SearchHotel.php");
		
		WebElement username = driver.findElement(By.id("username"));
		passinput(username,"gopiking");
		
		WebElement password = driver.findElement(By.id("password"));
		passinput(password,"Gopinath@1993");
		
		WebElement login = driver.findElement(By.id("login"));
		clickelement(login);
		
		WebElement location = driver.findElement(By.id("location"));
		select (location, "ByIndex", "5");
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		select(hotels, "Byvalue", "Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		select(roomtype, "ByIndex", "4");

		WebElement numberofrooms = driver.findElement(By.id("room_nos"));
		select(numberofrooms, "ByIndex", "6");
		
        WebElement checkin = driver.findElement(By.id("datepick_in"));
        checkin.clear();
        passinput(checkin,"06/06/2022");
		
        WebElement checkout = driver.findElement(By.name("datepick_out"));
        checkout.clear();
        passinput(checkout,"10/06/2022");	
		
        WebElement adultperroom = driver.findElement(By.id("adult_room"));
        select(adultperroom, "ByIndex", "2");
        
		WebElement childrenperroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		select (childrenperroom, "ByIndex", "0");
        
        WebElement search = driver.findElement(By.id("Submit"));
        clickelement(search);
        
        WebElement radiobutton = driver.findElement(By.name("radiobutton_0"));
        clickelement(radiobutton);
        
        WebElement continuee = driver.findElement(By.className("reg_button"));
        clickelement(continuee);
        
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
        passinput(firstname,"gopinath");
        
        WebElement lastname = driver.findElement(By.id("last_name"));
        passinput(lastname,"palanivel");
        
        WebElement address = driver.findElement(By.name("address"));
        passinput(address,"77,T.P.Arumugam nagar,Tiruchengode");       

        WebElement creditcardno = driver.findElement(By.id("cc_num"));
        passinput(creditcardno,"1234567890123456");   
        
        WebElement creditcardtype = driver.findElement(By.id("cc_type"));
        select(creditcardtype, "ByvisibleText", "VISA" );
        
        WebElement expmon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
        select(expmon, "Byvalue", "10");
        
        WebElement expyear = driver.findElement(By.id("cc_exp_year"));
        select(expyear, "ByIndex", "12");
        
        WebElement cvv = driver.findElement(By.name("cc_cvv"));
        passinput(cvv,"564");
        
        WebElement booknow = driver.findElement(By.id("book_now"));
        clickelement(booknow);
        
        WebElement myitinerary = driver.findElement(By.xpath("/html/body[1]/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[2]"));
        clickelement(myitinerary);
        
        WebElement logout = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));
        clickelement(logout);
        
		
	}
	
	
}
