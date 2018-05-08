package listen;

import java.util.Iterator;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class IMethodInterceptorEx implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		// TODO Auto-generated method stub
		Iterator<IMethodInstance> itr = methods.iterator();
		
		while(itr.hasNext())
		{
			if(itr.equals("TestToFail"))
			{
				
			}
				
		}
			
			
		return null;
	}
	

}
