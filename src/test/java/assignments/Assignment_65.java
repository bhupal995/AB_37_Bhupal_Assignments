package assignments;

import java.util.Arrays;

//Create an array of length 4 & copy its value to anotherarray using iteration
public class Assignment_65
{
	public static void main(String[] args) 
	{	
		int[] num = new int[4];
		num[0]=5;
		num[1]=12;
		num[2]=8;
		num[3]=29;
		
		int[] row = new int[4];
		System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++)
		{		
			row[i]=num[i];	
		}
		System.out.println(Arrays.toString(row));
		Arrays.sort(row);
		System.out.println("After sorting"+Arrays.toString(row));
	}

}
