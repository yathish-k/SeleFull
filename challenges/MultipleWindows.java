package challenges;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public void main(String ags[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window"+parentWindow);
		
		driver.findElement(By.xpath("//div[@id='content']/p[2]/button")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator itr = windows.iterator();
		
		
	}
	
	
}
