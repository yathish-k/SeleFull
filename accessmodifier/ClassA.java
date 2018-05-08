package accessmodifier;

public class ClassA {

	public int a;
	public String ab;
	private int b;
	private String bc;
	
	public void pub_A(int b1, int p2)
	{
		a=b;
		System.out.println("Public a"+a);
		pri_B(p2);
	
	}
	
	private void pri_B(int b2)
	{
		b = b2;
		System.out.println("Private b"+b);
	}
	
	final public void pub_C(String str1)
	{
		ab=str1;
		System.out.println("Public ab "+ab);
	}
	
	private void pri_D(String str2)
	{
		bc=str2;
		System.out.println("Private bc "+bc);
	}
	
}
