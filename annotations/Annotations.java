package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite(){		
		System.out.println("BeforeSuite");		
	}
	
	@BeforeTest
	public void beforeTest(){		
		System.out.println("BeforeTest");		
	}
	
	@BeforeClass
	public void beforeClass(){		
		System.out.println("BeforeClass");		
	}
	
	@BeforeMethod
	public void beforeMethod(){		
		System.out.println("BeforeMethod - InvokeApp");		
	}
	
	@Test
	public void deleteLead(){		
		System.out.println("DeleteLead");		
	}
	
	@Test
	public void createLead(){		
		System.out.println("CreateLead");		
	}
	
	@AfterMethod
	public void afterMethod(){		
		System.out.println("AfterMethod - CloseBrowser");		
	}
	
	@AfterClass
	public void afterClass(){		
		System.out.println("AfterClass");		
	}
	
	@AfterTest
	public void afterTest(){		
		System.out.println("AfterTest");		
	}
	
	@AfterSuite
	public void afterSuite(){		
		System.out.println("AfterSuite");		
	}
}
