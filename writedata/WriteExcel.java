package writedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public void writedata(String a) throws IOException
	{
		FileInputStream fis;
		try {
			File file = new File("./data/excel.xlsx");
			fis = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(0).getLastCellNum();
			System.out.println(rowcount);
			XSSFRow row = sheet.getRow(0);
			String header = row.getCell(0).getStringCellValue();
			
			switch(header)
			{
				case "policyNum":
					for(int i=1;i<3;i++)
					{
						String data = row.getCell(i).getStringCellValue();
						if(data.isEmpty())
						{
							XSSFCell cell = row.getCell(i);
							cell.setCellValue(a);
						}
						
					}
									
			}
			
			FileOutputStream fout = new FileOutputStream(file);
			book.write(fout);
			book.close();
		}
		
		catch(Exception e)
		{
			System.out.println("abc");
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		WriteExcel exce = new WriteExcel();
		
		exce.writedata("Asdd11");
	}
	
	
}
