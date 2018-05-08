package challenges;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class DatepickerCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.hpso.com/individuals/personal-insurance/Life-insurance/Group-Term-Life");
		
		String date1 = "04/15/1991";
		
		String[] dat = date1.split("/");
		
		String month = dat[0];
		String date = dat[1];
		String year = dat[2];
		
		System.out.println(month+"/"+date+"/"+year);
				
		
		driver.findElement(By.xpath("//span[@id='button-txt']/h4/a")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String win:windows)
			driver.switchTo().window(win);
		
		new Select(driver.findElement(By.xpath("//select[@id='ctrl_9270_3163_0_0']"))).selectByVisibleText("Alabama");
		driver.findElement(By.xpath("//button[@type='submit' and @class=' btnSubmitRight curved']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='  curved AcceptButton']")).click();
		
		driver.findElement(By.id("ctrl_9364_3180_0_0")).click();
		
		Thread.sleep(3000);
		//selecting year
		new Select(driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[2]"))).selectByVisibleText(year);
		
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		Thread.sleep(3000);
		
		int i = 0;
		i = Integer.parseInt(month);
			String mon = months[i-1];
		System.out.println(i);	
			new Select(driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[1]"))).selectByVisibleText(mon);
		
		int j = Integer.parseInt(date);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='"+j+"']")).click();
		
		System.out.println("Passed");
	}

}
