package challenges;

import java.util.Scanner;

public class StringDevNumNChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.next());
		StringBuffer num = new StringBuffer(), 
		chars = new StringBuffer(),
		syms = new StringBuffer();
		
		int size = str.length();
		
		for(int i=0;i<size;i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
				chars.append(str.charAt(i));
			else
				syms.append(str.charAt(i));
		}
		
		System.out.println(num);
		System.out.println(chars);
		System.out.println(syms);
	}

}
