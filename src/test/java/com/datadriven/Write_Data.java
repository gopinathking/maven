package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void write_Data() throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("INFO5");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("GOPI");
		
		w.getSheet("INFO5").getRow(0).createCell(1).setCellValue("10000");
		w.getSheet("INFO5").createRow(1).createCell(0).setCellValue("SENTHIL");
		w.getSheet("INFO5").getRow(1).createCell(1).setCellValue("50000");
		w.getSheet("INFO5").createRow(2).createCell(0).setCellValue("venki");
		w.getSheet("INFO5").getRow(2).createCell(1).setCellValue("500");
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		write_Data();
		
	}
	
}
