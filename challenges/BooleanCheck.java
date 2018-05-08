package challenges;

class ABC
{
	int a;
	int b;
	boolean equals()
	{
		return (a==b);
	}
}


public class BooleanCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC av= new ABC();
		av.a=5;
		av.b=5;
		System.out.println(av.equals());
		

	}

}
