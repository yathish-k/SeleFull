package challenges;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String line = "I am engineer";
		
		String[] words = line.split(" ");
		
		char[] out=null;
		
		for(String word: words)
		{
			char[] chars = word.toCharArray();
			Set<Character> ch = new LinkedHashSet<Character>();
			for(char c: chars)
				ch.add(c);
			System.out.println(ch);
			out = null;
		}
	}

}
