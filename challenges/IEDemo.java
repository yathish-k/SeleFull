package challenges;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.seleniumhq.org/");
	}

}
