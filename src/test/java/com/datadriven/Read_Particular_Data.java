package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Particular_Data {

private static void Read_Particular_Data() throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			}
		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		}
}
public static void main(String[] args) throws IOException {	
	Read_Particular_Data();
	
}}

	

