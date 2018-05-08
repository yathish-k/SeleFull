package challenges;

final class A{
	public void aa()
	{
		System.out.println("AA Final");
	}
}

class FinalVar
{
	public final int a;
	public FinalVar(int b) {
		a=b;
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.aa();
	}

}
