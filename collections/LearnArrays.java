package collections;

import java.util.Arrays;

public class LearnArrays {

	/**
	 * Date: 19 Feb 2017
	 * An array is a container object that holds a fixed number  
	 * of values of a single type. 
	 * The length of an array is established when the array is 
	 * created.After creation, its length is fixed. 
	 * 
	 * Each item in an array is called an element, and 
	 * each element is accessed by its numerical index.
	 * Starting index : 0
	 * 
	 */

	public static void main(String[] args) {

		// It is 6 sized array supports only String
		String[] mentors = new String[6];
		mentors[0] = "Karim";
		mentors[1] = "Indhu";
		mentors[2] = "Gopi";
		mentors[3] = "Sunil";
		mentors[4] = "Nesa";
		mentors[5] = "Lokesh"; // if not assigned ; so default value is null
		System.out.println("The number of mentors are :"+mentors.length);

		System.out.println(mentors[1]);
		System.out.println(mentors[5]);
		//System.out.println(mentors[6]); // accessing beyond size, throws exception


		// Array sort for string throw error
		Arrays.sort(mentors);
		System.out.println(mentors[0]);
		System.out.println(mentors[5]);

		// Filling an array to place a specific value at each index 
		Arrays.fill(mentors, "Babu");
		System.out.println(mentors[0]);


		// Another way of creating
		int[] weeks = {1,2,3,4,5,6,1,8,7,9};
		System.out.println("int array "+weeks[0]);


		// Searching for a mentor
		System.out.println("The index of 1 is :"
				+ " :"+Arrays.binarySearch(weeks, 1));
		// binarySearch not applicable to String but can be used for character


		int[] anotherWeek = weeks.clone();
		System.out.println(anotherWeek[2]);

		anotherWeek[2]=23;
		// Compare 2 arrays
		System.out.println("The comparison of the 2 int arrays are:"
				+ " clone : "+Arrays.equals(weeks, anotherWeek));

		
		int[] nextWeek = Arrays.copyOf(weeks, 5);
		for (int i = 0; i < nextWeek.length; i++) {
			System.out.println(nextWeek[i]);
		}
		
		
		//System.out.println(sort.toString());

		
		
		
		
		
		
		
		
		


	}

}
