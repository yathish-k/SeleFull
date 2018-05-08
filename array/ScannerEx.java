package array;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a and b");
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		String abc = in.nextLine();
		int b = in.nextInt();
		int c= a+b;
		System.out.println("addition is "+c+abc);
		
	}

}
