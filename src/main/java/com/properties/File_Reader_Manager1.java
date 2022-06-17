package com.properties;

import java.io.IOException;

public class File_Reader_Manager1 {
	
	private  File_Reader_Manager1() {
	}
	public static File_Reader_Manager1 getInstanceFRM() {
		File_Reader_Manager1 frm1 = new File_Reader_Manager1();
		return frm1;
	}
	public Configuration_Reader1 getInstanceCR() throws IOException {
		Configuration_Reader1 cr1 = new Configuration_Reader1();
		return cr1;
	}
	
}
