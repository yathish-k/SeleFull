package challenges;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int m =0;
		String mm = "Aug"; 
		int i= Integer.parseInt(mm);
		
		for(int j=0; j<12; j++)
		{
			if(mm.equalsIgnoreCase(months[j]))
			{
				m = j+1;
				break;
			}
				
		}
		System.out.println("Month "+mm+" number"+m);
	}

}
