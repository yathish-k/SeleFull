package autoIt;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class FileDownload {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://ama1residentdisability-amaia.myinsurancepurchase.com/MemberEnrollment");
		Select stateselection = new Select(driver.findElement(By.xpath("//*[@id='ctrl_9270_3211_0_0']")));
		stateselection.selectByVisibleText("Alabama");
		
		driver.findElement(By.xpath("//*[@id='ctrl_9760_3211_0_0']")).click();
		
		driver.findElement(By.xpath("//*[@id='sectionBody3228']/div/div/div/label/a")).click();
		driver.close();
		
		Set<String> windows = driver.getWindowHandles();
		/*Iterator itr = windows.iterator();
		while(itr.hasNext())
			driver.switchTo().window(itr.next());*/
		
	//	driver.manage().de
		for(String wins: windows)
			driver.switchTo().window(wins);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='icon']")).click();
		
		//StringBuilder abc = new StringBuilder("ABC");
		StringBuffer abc = new StringBuffer("ABC");
		System.out.println(abc.reverse());
		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_S);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyRelease(KeyEvent.VK_S);
//		Thread.sleep(3000);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		
		
		//rob.mousePress(MouseEvent.BUTTON1);
		
		try {
			Runtime.getRuntime().exec("C:\\autoIt_scripts\\filedownload.exe");
			System.out.println("asa");
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
