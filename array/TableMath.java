package array;

public class TableMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] marks = {
				{10, 10},
				{20, 20},
				{30, 30},
				{40, 40}
				};
		
		System.out.println("size of the aray"+marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.println(marks[i][j]);
			}
		}
				
				
		
		
		
		
	}

}
