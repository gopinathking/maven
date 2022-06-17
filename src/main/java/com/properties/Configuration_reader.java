package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Configuration_reader {
	
	public static Properties p;
	
	public Configuration_reader() throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration_reader.java");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);	
	}

	    public String geturl() throws IOException {	
		String url = p.getProperty("url");
		return url;
	}
        public String getusername() throws IOException {	
    	String username = p.getProperty("username");
    	return username;
}
	    public String getpassword() throws IOException {		    
	    String password = p.getProperty("password");
        return password;
	}
	
}
