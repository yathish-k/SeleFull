package challenges;

import java.util.Random;

public class FloatwithIntcmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String amt = "$15.23";
		String am = amt.replace("$", "");
		
		float fl = Float.parseFloat(am);
		
		System.out.println(fl);
		
		if(fl>15)
		{
			System.out.println("Pass");
			
		}
	
		
		Random ran = new Random();
		
		int in = 1+ran.nextInt(100);
		
		System.out.println(in);
	}

}
