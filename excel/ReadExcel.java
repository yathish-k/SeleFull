package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readExcel() throws InvalidFormatException, IOException {


		// Read the File
		
		File src = new File("./data/Login.xlsx");		


		//	Open  a work (Using XSSFWorkbook)		
		XSSFWorkbook wb = new XSSFWorkbook(src);

		//	Go to the specific sheet using name or index (XSSFSheet -> getSheet)
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Rows Count
		
		int rowCount = sheet.getLastRowNum();		

	//	Go to the specific row from where data to be read (XSSFRow -> getRow)
		XSSFRow row = sheet.getRow(1);
		//	Go to the specific column(XSSFCell -> getCell)
		XSSFCell cell = row.getCell(0);
		//	Read the contents of the cell (getStringCellValue)
		
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);
		
		//Second Cell Value
	
	}	

}