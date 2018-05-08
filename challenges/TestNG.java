package challenges;

import org.testng.annotations.Test;

public class TestNG {

	@Test(enabled=false)
	public void A()
	{
		System.out.println("Test A");
	}
	
	@Test(enabled=false)
	public void B()
	{
		System.out.println("Test B");
	}
	
	@Test(enabled=true)
	public void C()
	{
		System.out.println("Test C");
	}
	
}
