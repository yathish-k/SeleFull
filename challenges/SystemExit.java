package challenges;

public class SystemExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("BEfore Exit");
			System.exit(0);
			System.out.println("AFter exit");
		}
		finally
		{
			System.out.println("finally");
		}
	}

}
