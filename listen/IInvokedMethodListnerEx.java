package listen;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListnerEx implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("The method is "+method.getTestMethod());
		System.out.println("The Result is "+testResult.getName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("The method is "+method.getTestMethod());
		System.out.println("The Result is "+testResult.getName());
		
	}

}
