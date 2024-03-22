package assignments;

import java.util.Arrays;

//"Create an array of length 3 having String datatype and print it without sorting. 
//Now Sort the array and print its value after sorting.
//Use toSting function to print the array"
public class Assignment_64
{

	public static void main(String[] args)
	{
		String name[] =  new String[3];
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Arjun";
		
		System.out.println("Before sorting"+Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("After  sorting"+Arrays.toString(name));
		
	}
	
}
