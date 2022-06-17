package com.properties1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties1\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
	}
	public String get_url() throws IOException {

		String url = p.getProperty("url");
		
		return url;
				
	}
	
	public String get_username() throws IOException {

		String username = p.getProperty("username");
		
		return username;
				
	}
	
	public String get_password() throws IOException {

		String password = p.getProperty("password");
		
		return password;
				
	}
	

	public String getCheckin() throws IOException {

		String checkin = p.getProperty("checkin");
		
		return checkin;
				
	}
	
	public String getCheckout() throws IOException {

		String checkout = p.getProperty("checkout");
		
		return checkout;
				
	}
	
	
}
