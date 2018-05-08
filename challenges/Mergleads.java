package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Mergleads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


ChromeDriver driver = new ChromeDriver ();



driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();

driver.findElementById("username").sendKeys("DemoSalesManager");

driver.findElementById("password").sendKeys("crmsfa"); 

Thread.sleep(5000);

driver.findElementByClassName("decorativeSubmit").click();

	

		driver.findElementByLinkText("CRM/SFA").click();

		

		driver.findElementByLinkText("Leads").click();

		
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("//img[@alt='Lookup'][1]").click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		List<String> winlist  = new ArrayList <String>();
		
		winlist.addAll(allwindow);
		
		driver.switchTo().window(winlist.get(1));
				
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10734");
		
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();
		
		driver.switchTo().window(winlist.get(0));
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> allwindow1 = driver.getWindowHandles();
		
		ArrayList<String> winlist1 = new ArrayList<String>();
		
		winlist1.addAll(allwindow1);
		
		driver.switchTo().window(winlist1.get(1));
		
		
		
	}

	private static ArrayList addAll(Set<String> fl1) {
		// TODO Auto-generated method stub
		return null;
	}

}
