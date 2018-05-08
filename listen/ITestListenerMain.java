package listen;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(IHookableEx.class)	


public class ITestListenerMain {			
	
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
					

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
	//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	//FirefoxDriver driver= new FirefoxDriver();
	/** System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//Step 4: Enter UserName
	driver.findElementById("username").sendKeys("DemoSalesManager");

	//Step 5: Enter Password
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();**/
	System.out.println("This method to test Pass");					
    //Assert.assertTrue(false);
	
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}			