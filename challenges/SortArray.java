package challenges;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,3,6,1,2,9};
		
		int n = arr.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The aray is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
