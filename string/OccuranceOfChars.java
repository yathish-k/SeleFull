package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfChars {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.next().toLowerCase();
		System.out.println("Entered string "+s1);
		
		int count = 0;
		//char[] s = s1.toCharArray();
		char[] s2 = s1.toCharArray();
		/*for(int i=0;i<s1.length();i++)
		{*/
		while(s1.length()>0)
		{
			count=1;
			char ch = s1.charAt(0); 
			for(int j=1;j<s1.length();j++)
			{
				if(ch==s1.charAt(j))
					count++;
			}
			
			s1 = s1.replace(""+ch, "");
			System.out.println(ch+""+count);
		}
		
		//List<char> str = new List<char>();
		
		Map<Character, Integer> ma = new HashMap<Character, Integer>();
		
		char[] ch = s1.toCharArray();
		
		System.out.println("Using collections");
		for(char c: ch)
		{
			if(ma.containsKey(ch))
			{
				ma.put(c, ma.get(c)+1);
			}
			else
			{
				ma.put(c, 1);
			}
			
			
		}
		System.out.println(ma);
		
		
		
	}

}
