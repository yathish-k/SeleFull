package challenges;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterTextWOSendkey {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.name("cusid")).sendKeys(Keys.SPACE+""+Keys.SPACE+"abc");
		
		WebElement eel = driver.findElement(By.name("uid"));
		WebElement eel1 = driver.findElement(By.name("password"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;

		//executor.executeScript("document.getElementByName("cusid").value='abcd'");
		executor.executeAsyncScript("arguments[0].value='admin',arguments[1].value='password'", eel, eel1);
		
		//.sendKeys("   "+"abcd");
		
		
		
		String ab = driver.findElement(By.name("cusid")).getAttribute("value");
		
		System.out.println("value"+ab);
		
	}
	
}
