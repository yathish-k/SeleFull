package accessmodifier;

class Priv{
	public int a;
	private int b;
	int e=0;
	
	/*Priv(int c, int d)
	{
		a=c;
		b=d;
		e=a+b;
		System.out.println(e);
	}*/
	
	public void abc(int c, int d)
	{
		a=c;
		b=d;
		System.out.println(a+" "+b);
	}
	
}

public class AccessModPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priv a = new Priv();
		a.abc(5, 6);
		//System.out.println(a.a);
	
	}

}
