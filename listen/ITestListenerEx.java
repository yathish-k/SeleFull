package listen;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerEx implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The Test "+result.getName()+"started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The Test "+result.getName()+"passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("The Test "+result.getName()+" failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("The Test "+result.getName()+" failed");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("The Test "+result.getName()+" failed but within success percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("All Tests "+context.getName()+" started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("All Test "+context.getName()+" finished");
		
	}

}
