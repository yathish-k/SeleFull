package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEMultipleWindow {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		String parent = driver.getWindowHandle();
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		robo.delay(1000);
		robo.keyRelease(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Set<String> wins = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList(wins);
		
		driver.switchTo().window(al.get(1));
		
		driver.get("https://www.google.co.in/");
		
		
		
	}

}
