package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupcharsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string");
		String data = "wardswa";
		
		List<Character> li = new ArrayList();
		char[] chs = data.toCharArray();
		
		for(char c: chs)
		{
			li.add(c);
		}
		System.out.println(li);
		Set<Character> se = new LinkedHashSet(li);
		
		System.out.println(se);
		
		
		
		
	}

}
