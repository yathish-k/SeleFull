package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rever = "AAFRCDA";
int j = 0;
		
		for(int i=0;i<rever.length();i++)
		{
			for(int k=i+1;k<rever.length();k++){
			if(rever.charAt(i)==rever.charAt(k))
			{
				//System.out.println(rever.charAt(i));
				j++;
				//break;
			}
			}
		}
			if(j>0)
			System.out.println(j);
	
	//using collection
			
			char[] chars = rever.toCharArray();
			
			/*Map<Character, Integer> charcount = new HashMap<>();
			
			for(Character c: chars)
			{
				if(((Object) charcount).isContains(c))
					
			}
	*/
	}

}
