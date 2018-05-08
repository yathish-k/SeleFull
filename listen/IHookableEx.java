package listen;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class IHookableEx implements IHookable {

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		
		callBack.runTestMethod(testResult);
		System.out.println("The result is"+testResult.getName());
		
	}
	

}
