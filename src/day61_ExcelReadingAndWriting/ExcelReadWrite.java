package day61_ExcelReadingAndWriting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelReadWrite {

	public static void main(String[] args) {

		String fp = "/Users/mac/Desktop/Workbook1.xlsx";
		String sn = "Sheet1";
		
		ExcelReadWrite obj = new ExcelReadWrite(fp, sn);
		String data = obj.readData(2,1);
		System.out.println(data);
		
		obj.writeData(2, 1, "Carson");
		data = obj.readData(2, 1);
		System.out.println(data);

	}
	
	
	
	String filePath;
	String sheetName;
	FileInputStream file;
	Workbook excelFile;
	Sheet sheet;
	Cell  cell;
	
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 */
	public ExcelReadWrite(String filePath, String sheetName) {
		this.filePath = filePath;
		this.sheetName = sheetName;
		try {
			FileInputStream file = new FileInputStream(filePath);
			excelFile = WorkbookFactory.create(file);
			sheet = excelFile.getSheet(sheetName);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String readData(int row, int cellNumber) {
		cell = sheet.getRow(row).getCell(cellNumber);
		return cell.toString();
	}
	
	
	public void writeData(int row, int cellNumber, String setValue) {
		cell = sheet.getRow(row).getCell(cellNumber);
		cell.setCellValue(setValue);
	}
	
	

}
