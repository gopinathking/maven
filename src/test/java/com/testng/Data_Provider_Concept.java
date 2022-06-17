package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Concept {

	@Test(dataProvider = "input")
	public void Credentials(String username , String password) {
		 
		System.out.println("username:"+username);
		
		System.out.println("password:"+password);

	}
	@DataProvider
	public Object[][] input() {
		
		return new Object[][] {
		
				{"gopi","9865"},
				{"sankar","9578"},
				{"vihaan","8504"}
			
		};
	
}
}
