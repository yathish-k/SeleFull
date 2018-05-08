package challenges;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWriteandRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String data = driver.findElement(By.xpath("//td[contains(text(),'Customer ID')]")).getText().toString();
		
		*/
		
		String data = "1234";
		File location = new File("C:\\Testleaf_sel\\SelJan2017-master\\data\\excel.xlsx");
		
		FileInputStream fis = new FileInputStream(location);
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet2 = wbook.getSheet("Sheet2");
		
		XSSFRow row = sheet2.createRow(0);
		XSSFCell cell = row.createCell(0);
		//cell.c
		cell.setCellValue(data);
		System.out.println("aa");
		FileOutputStream fout = new FileOutputStream(location);
		//fout.write();
		wbook.write(fout);
		fout.flush();
		fout.close();
		wbook.close();
		//wbook.close();
		
		System.out.println("ABC");
FileInputStream fis1 = new FileInputStream(location);
		
		XSSFWorkbook wbook1 = new XSSFWorkbook(fis1);
		
		XSSFSheet sheet3 = wbook1.getSheet("Sheet2");
		
		//int rownum = sheet3.getLastRowNum()
		XSSFRow row1 = sheet3.getRow(0);
		XSSFCell cell1 = row1.getCell(0);
		XSSFCell cell2 = row1.getCell(1);
		
		/*double num = cell2.getNumericCellValue();
		System.out.println(num);*/
		
		String data1 = cell.getStringCellValue();
		fis1.close();
		wbook1.close();
		System.out.println(data1);
		
		
		
		
		
	}

}
