package day61_ExcelReadingAndWriting;

import java.io.FileInputStream;

// I'm importing all classes from Apache OI library
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception{
		
		String filePath = "/Users/mac/Desktop/Workbook1.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream file = new FileInputStream(filePath);
		
		Workbook excelFile = WorkbookFactory.create(file);
		// XSSFWorkbook excelFile2 = new XSSFWorkbook(file); //similar to above line
		
		
		Sheet sheet = excelFile.getSheet(sheetname);
		
		Cell cell = sheet.getRow(0).getCell(0);
		Cell cell1 = sheet.getRow(1).getCell(3);
		
		String cellData = cell.toString();
		String cellSalary = cell1.getStringCellValue();  // comes from Apache class
		
		System.out.println(cellData);
		System.out.println(cell1);
		
		
		

	}

}
