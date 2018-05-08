package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		//WebElement wb = driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/a/span[1]/span/span"));
//		Actions build = new Actions(driver);
//		
//		build.moveToElement(driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/a/span[1]/span/span")))
//		.moveToElement(driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/ul/li[4]/a/span[1]")))
//		.moveToElement(driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/ul/li[4]/ul/li[2]/a/span[1]/span/span")))
//		//.click(driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/ul/li[4]/ul/li[2]/a/span[1]/span/span")))
//		.click()
//		.build()
//		.perform();
//		System.out.println("Passes");
		driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/ul/li[1]/ul/li[1]/a/span[1]/span/span")).click();
	}

}
