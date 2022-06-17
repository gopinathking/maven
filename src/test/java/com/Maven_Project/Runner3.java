package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.pomclass.Dresses;
import com.sdp.Page_object_manger1;

public class Runner3 extends baseclass {
	
	public static WebDriver driver=launchBrowser("chrome");
	
	public static Page_object_manger1 pom1 = new Page_object_manger1(driver);
	
	public static void main(String[] args) {
			
		urllaunch("http://automationpractice.com/index.php?id_product=3&controller=product");

			
		pom1.getinstancedresses().getQty().clear();
		passinput(pom1.getinstancedresses().getQty(),"3");
		
		
		Select s=new Select(pom1.getinstancedresses().getSize());
		s.selectByIndex(1);
		
		
		pom1.getinstancedresses().getAddtocart().click();
	}
	

}
