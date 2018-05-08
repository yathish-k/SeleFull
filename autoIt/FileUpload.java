package autoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("input_resumeParser")).click();
		

		
		
		try {
			Runtime.getRuntime().exec("C:\\autoIt_scripts\\fileupload.exe");
		//	System.out.println("asa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Executed with errors");
			e.printStackTrace();
		}
		finally {
			System.out.println("Executed");
		}
		

	}

}
