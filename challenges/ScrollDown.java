package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// load the browser with url
		driver.get("http://legacy.crystalcruises.com/");
		
		JavascriptExecutor jv = (JavascriptExecutor)driver;
		//((JavascriptExecutor) driver).executeScript("scroll(0,1050);");
		jv.executeScript("scroll(0,1050);");
		((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
	}

}
