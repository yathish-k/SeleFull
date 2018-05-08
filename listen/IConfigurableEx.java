package listen;

import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;

public class IConfigurableEx implements IConfigurable {

	@Override
	public void run(IConfigureCallBack callBack, ITestResult testResult) {
		
		callBack.notify();
		System.out.println("The result is "+testResult.getName());
		
	}

}
