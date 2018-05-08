package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] blood = { {"Test1", "B+ve"}, 
							{"Test2", "B-ve"}};
		
		/*for(int i=0; i<blood.length; i++)
		{
			for(int j=0;j<blood.length;j++)
			{
				System.out.println(blood[i][j]);
			}
		}*/
		
		for(String[] s: blood)
		{
			for(String ss: s)
				System.out.println(ss);
		}
			
	}

}
