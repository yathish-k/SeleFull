package challenges;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertScreenshot {
	
	public static void main(String[] args) throws IOException, HeadlessException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert();
		
		BufferedImage br = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		System.out.println("pp");
		ImageIO.write(br, "png", new File("./screens/alertsnap.png"));
		System.out.println("pp");
		//write(br, "png", "./screens/alertsnap.png");
		
	}

}
