package string;

public class StringREverseRecursivve {

	
	public static String reverse(String rev){
		if(rev.length()<2)
			return rev;
		else 
			return reverse(rev.substring(1)) + rev.charAt(0);
	}
	
	public static void main(String[] args)
	{
		String rever = "ABCDEF";
		System.out.println(reverse(rever));
	
		String re = "";
		for(int i=rever.length()-1;i>=0;i--)
			re = re+rever.charAt(i);
		System.out.println(re);
		
	}
}
