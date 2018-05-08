	package extentreportsEx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String captureScreenshot(WebDriver driver, String screenshot)
	{
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = "C:/Testleaf_sel/SelJan2017-master/screens/"+screenshot+".png";
		File dest1 = new File(dest);
		
			FileUtils.copyFile(src, dest1);
			
			return dest;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
		
		
	}
}
