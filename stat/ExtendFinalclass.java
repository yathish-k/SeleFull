package stat;

//abstract class ABC{ 
final class ABC{
	//void abc();
	void ba()
	{
		System.out.println("ABC");
	}
}

//class CH extends ABC
//{
//
//	@Override
//	void abc() {
//		// TODO Auto-generated method stub
//		System.out.println("CH");
//	}
//	
//}

public class ExtendFinalclass /*extends CheckFinal*/{

	
	public static void main(String args[])
	{
		ABC a = new ABC();
		//a.abc();
		a.ba();
	}
}
