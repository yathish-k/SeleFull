package excel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadExcels {


	public static void main(String[] args) throws InvalidFormatException, IOException
	{

		// Read the File
		File src = new File("./data/Login.xlsx");		


		//	Open  a work (Using XSSFWorkbook)		
		XSSFWorkbook wb = new XSSFWorkbook(src);

		//	Go to the specific sheet using name or index (XSSFSheet -> getSheet)
		XSSFSheet sheet = wb.getSheetAt(0);

		//Rows Count
		int rowCount = sheet.getLastRowNum();		

		//Go to the specific row from where data to be read (XSSFRow -> getRow)
		for (int i=1; i<=rowCount; i++)
		{
			XSSFRow row = sheet.getRow(i);

			//	Go to the specific column(XSSFCell -> getCell)
			XSSFCell cell = row.getCell(0);

			//	Read the contents of the cell (getStringCellValue)
			String cellValue = cell.getStringCellValue();

			//print the cellvalue
			System.out.println(cellValue);
		}

		/* The below code is to open browser and enter data into perticualar Textfields
		 
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 //enter your url here
		 driver.get("url");

		 driver.findElement(By.id("idlocator")).sendKeys("keysToSend");

		 */

	}	

}