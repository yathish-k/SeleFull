package challenges;

import java.io.IOException;

import org.testng.Assert;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to check finally
		String a = "Hello";
		try{
			
			Assert.assertFalse(true);
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
		finally
		{
			System.out.println("Finally block");
		}
		
	}

}
