package com.properties;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
	
	}
	public static File_Reader_Manager getinstanceFR() {
		
		File_Reader_Manager frm = new File_Reader_Manager();
		
		return frm;
	}
	public Configuration_reader getInstanceCR() throws IOException {
		
		Configuration_reader cr = new Configuration_reader();
		
		return cr;

	}
	
	
}
