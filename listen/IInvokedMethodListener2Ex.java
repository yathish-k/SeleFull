package listen;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener2;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class IInvokedMethodListener2Ex implements IInvokedMethodListener2{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
	
		System.out.println("Context "+context.getFailedTests()+" method "+method.getTestMethod());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Context "+context.getFailedTests()+" method "+method.getTestMethod());
	}
	
	

}
