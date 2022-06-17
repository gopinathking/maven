package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader1 {
	
	public static Properties p;
	
	public Configuration_Reader1() throws IOException {
        File f = new File ("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		
		p.load(fis);
	}

	public String getUrl() throws IOException {
				
		String url = p.getProperty("url");
		
		return url;
		
	}
	
	public String getUsername() throws IOException {
		
		String username = p.getProperty("username");
		
		return username;

	}
	
	public String getPassword() {
		
		String password = p.getProperty("password");
		
		return password;
	}
}
