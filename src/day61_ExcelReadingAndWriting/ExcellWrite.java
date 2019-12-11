package day61_ExcelReadingAndWriting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcellWrite {

	public static void main(String[] args) throws Exception{
		

		//Earlier we read from excel sheet, Now let's modify the excel sheet
		String filePath = "/Users/mac/Desktop/Workbook1.xlsx";
		String sheetname = "Sheet1";
		
		
		FileInputStream file = new FileInputStream(filePath);
		Workbook excelFile = WorkbookFactory.create(file);
		Sheet sheet = excelFile.getSheet(sheetname);
		
		Cell cell = sheet.getRow(1).getCell(1);
		System.out.println(cell); //Alex
		
		cell.setCellValue("Karel");
		System.out.println(cell); //now it's Karel
		
		
		
	}

}
