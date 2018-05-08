package challenges;

public class SumofMultinumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		
		int product = 0;
		int productfive =0; 
		
		int sum=0;

		int i=1;
		while(sum<100)
		{
				product = 3*i;
				productfive = 5*i;
				System.out.println(product+" "+productfive);
			//if(product < a && productfive < a)
			//{	
				sum+=product+productfive;
			//}
			i=i+1;
		}
		
		System.out.println("sum"+sum);

	}

}
