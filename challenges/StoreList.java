package challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
	
		driver.get("http://www.guru99.com/accessing-forms-in-webdriver.html");
		
		List<WebElement> lis = driver.findElements(By.tagName("li"));
		
		System.out.println("Number of links"+lis.size());
		
		for(WebElement we: lis)
			System.out.println(we.getText());
	}

}
