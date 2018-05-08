package challenges;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.ChainedClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEx {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://calendarview.org/");
		
		String fulldate = "20/08/1991";
		
		String[] str = fulldate.split("/");
		String date1 = str[0];
		String mon1 = str[1];
		String year1 = str[2];
		int year = Integer.parseInt(year1);
		
		
		//getting year value and comparing
		int flag = 0;
		while(flag!=1)
		{
			String ymvalue = driver.findElement(By.xpath("//div[@id='embeddedCalendar']/div/table/thead/tr[1]/td")).getText();
			String[] ym = ymvalue.split(" ");
			String yy = ym[1];
			int y = Integer.parseInt(yy);
			if(y>year)
				driver.findElement(By.xpath("//div[@id='embeddedCalendar']/div/table/thead/tr[2]/td[1]")).click();
			else if(y<year)
				driver.findElement(By.xpath("//div[@id='embeddedCalendar']/div/table/thead/tr[2]/td[5]")).click();
			else if(y==year)
				flag=1;
		}
		
		//selecting month
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int i = 0;
		i = Integer.parseInt(mon1);
			String month = months[i-1];
		System.out.println(i);
		int fl = 0;
		
		while(fl!=1)
		{
			String ymvalue = driver.findElement(By.xpath("//div[@id='embeddedCalendar']/div/table/thead/tr[1]/td")).getText();
			String[] ym = ymvalue.split(" ");
			String mm = ym[0];
			int m = 0;
			for(int j=0; j<12; j++)
			{
				//String mu = months[j];
				if(mm.contains(months[j]))
				{
					m = j+1;
					break;
				}
					
			}
			System.out.println(m);
			if(i<m)
				{
				driver.findElement(By.xpath("//div[@id='embeddedCalendar']/div/table/thead/tr[2]/td[2]")).click();
				System.out.println("1");
				}
			else if(i>m)
					{
					driver.findElement(By.xpath("//div[@id='embeddedCalendar']/div/table/thead/tr[2]/td[4]")).click();
					System.out.println("2");
					}
			else if(m==i)
				fl=1;
		}
	
			
		//selecting date
		
		driver.findElement(By.xpath("(//td[text()='"+date1+"'])[1]")).click();
		
		
	}
}