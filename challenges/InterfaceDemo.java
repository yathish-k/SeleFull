package challenges;

interface i{
	final int a =10;
}
public class InterfaceDemo implements i{

	public void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//InterfaceDemo d = new InterfaceDemo();
		System.out.println(a);
	}

}
