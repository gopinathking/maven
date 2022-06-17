package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Particular_Row {

	public static void Particular_Row() throws IOException {
File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
				Cell cell = row.getCell(0);
				org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType.equals(org.apache.poi.ss.usermodel.CellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int num =(int) value;
					System.out.println(num);
				}
				}	
				}
	public static void main(String[] args) throws IOException {
		Particular_Row();
		
	}
	
	
}
