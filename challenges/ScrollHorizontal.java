package challenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://album.alexflueras.ro/galleries/landscapes.html");
		//driver.get("https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//*[@id='a4']/img"));
		
		//js.executeScript("window.scroll(0,600)");
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		System.out.println("Scrolled right");
		
		Thread.sleep(5000);
		driver.close();
	}
}
